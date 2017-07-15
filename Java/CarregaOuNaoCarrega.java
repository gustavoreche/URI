package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CarregaOuNaoCarrega {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();

        //while ((linha = br.readLine()) != null) {

    		//Scanner entrada = new Scanner (System.in);
    		
    		String cod = linha;		
    		String [] str = cod.split(" ");
    		
    		int n1 = Integer.parseInt(str[0]);
    		int n2 = Integer.parseInt(str[1]);
    		int cont = 0;
    		
    		int mult = 1;
    		
    		if (n1 > n2){
    			while (mult <= n1){
    				mult = mult * 2;
    				cont++;
    			}
    			if (mult > n1){
    				mult = mult / 2;
    			}
    		}
    		else{
    			while (mult <= n2){
    				mult = mult * 2;
    				cont++;
    			}
    			if (mult > n2){
    				mult = mult / 2;
    			}
    		}
    		
    		int multAux = mult; 
    		
    		int tamanho = cont;
    		int [] v1 = new int [tamanho];
    		tamanho--;
    		
    		while (tamanho >= 0){
    			if (n1 >= mult){
    				v1 [tamanho] = 1;
    				n1 = n1 - mult;
    			}
    			else{
    				v1 [tamanho] = 0;
    			}
    			mult = mult / 2;
    			tamanho--;
    		}
    		
//    		for (int i = v1.length - 1; i >= 0; i--){
//    			System.out.print(v1[i] + " ");
//    		}
    		
    		//System.out.println("");
    		//VETOR 2
    		mult = multAux;
    		tamanho = cont;
    		int [] v2 = new int [tamanho];
    		tamanho--;
    		
    		while (tamanho >= 0){
    			if (n2 >= multAux){
    				v2 [tamanho] = 1;
    				n2 = n2 - multAux;
    			}
    			else{
    				v2 [tamanho] = 0;
    			}
    			multAux = multAux / 2;
    			tamanho--;
    		}

//    		for (int i = v2.length - 1; i >= 0; i--){
//    			System.out.print(v2[i] + " ");
//    		}
    		
    		//System.out.println("");
    		//COMPARAÇÃO
    		
    		for (int i = v1.length - 1; i >= 0; i--){
    			if (v1[i] == v2[i]){
    				v1[i] = 0;
    			}
    			else{
    				v1[i] = 1;
    			}
    		}
    		
//    		for (int i = v1.length - 1; i >= 0; i--){
//    			System.out.print(v1[i] + " ");
//    		}
    		
    		//TRANSFORMAR PARA INTEIRO
    		int soma = 0;
    		for (int i = v1.length - 1; i >= 0; i--){
    			if (v1[i] == 1){
    				soma = soma + mult;
    			}
    			mult = mult / 2;
    		}
    		//System.out.println("");
    		System.out.println(soma);
        // }
		
	}
}