package URI;

import java.util.Scanner;

public class CorvoContador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int controle = 0;
		int cont = 0, soma = 0;
		
		while (controle == 0){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			String ent1 = str[0];
			String ent2 = ent1;
			
			if (ent1.equals("caw")){
				cont++;
				System.out.println(soma);
				soma = 0;
			}
			if (cont == 3){
				controle = 1;
			}
			else{
				if (ent1.equals("--*")){
					soma = soma + 1;
				}
				if (ent1.equals("-*-")){
					soma = soma + 2;
				}
				if (ent1.equals("-**")){
					soma = soma + 3;
				}
				if (ent1.equals("*--")){
					soma = soma + 4;
				}
				if (ent1.equals("*-*")){
					soma = soma + 5;
				}
				if (ent1.equals("**-")){
					soma = soma + 6;
				}
				if (ent1.equals("***")){
					soma = soma + 7;
				}
				if (ent1.equals("---")){
					soma = soma + 0;
				}
			}
		}
	}
}