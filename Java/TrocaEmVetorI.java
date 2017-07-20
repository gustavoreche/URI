package URI;

import java.util.Scanner;

public class TrocaEmVetorI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int v1[] = new int[20];
        for (int i = 19; i >= 0; i--){
        	int num = entrada.nextInt();
        	v1[i] = num;
        }
        for (int i = 0; i < 20; i++){
        	System.out.println("N[" + i + "] = " + v1[i]);
        }
	}
}