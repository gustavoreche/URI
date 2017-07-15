package URI;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = Integer.parseInt(entrada.nextLine());
		B = Integer.parseInt(entrada.nextLine());
		C = Integer.parseInt(entrada.nextLine());
		D = Integer.parseInt(entrada.nextLine());
		
		DIFERENCA = (A * B) - (C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA); 
	}

}
