package URI;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		int A,B,SOMA;
		
		Scanner entrada = new Scanner(System.in);
		
		A = Integer.parseInt(entrada.nextLine());
		B = Integer.parseInt(entrada.nextLine());
		
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
	}

}
