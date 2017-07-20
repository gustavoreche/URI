package URI;

import java.util.Scanner;

public class PreenchimentoDeVetorI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int v1[] = new int[10];
        int num = entrada.nextInt();
        for (int i = 0; i < 10; i++){
        	v1[i] = num;
        	num = num * 2;
        }
        for (int i = 0; i < 10; i++){
        	System.out.println("N[" + i + "] = " + v1[i]);
        }
	}
}