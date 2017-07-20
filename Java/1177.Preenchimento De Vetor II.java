package URI;

import java.util.Scanner;

public class PreenchimentoDeVetorII {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int v1[] = new int[1000];
        int num = entrada.nextInt();
        int numAux = num;
        for (int i = 0; i < 1000; i++){
        	if (numAux == num){
        		num = 0;
        		v1[i] = num;
        	}
        	else{
        		v1[i] = num;
        	}
        	num++;
        }
        for (int i = 0; i < 1000; i++){
        	System.out.println("N[" + i + "] = " + v1[i]);
        }
	}
}
