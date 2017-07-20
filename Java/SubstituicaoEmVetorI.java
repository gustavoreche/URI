package URI;

import java.util.Scanner;

public class SubstituicaoEmVetorI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int v1 [] = new int[10];
        for (int i = 0; i < 10; i++){
        	v1[i] = entrada.nextInt();
        	if (v1[i] <= 0){
        		v1[i] = 1;
        	}
        }
        for (int i = 0; i < 10; i++){
        	System.out.println("X[" + i + "] = " + v1[i]);
        }
	}
}