package URI;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		
		int A,B,PROD;
		
		Scanner entrada = new Scanner(System.in);
		
		A = Integer.parseInt(entrada.nextLine());
		B = Integer.parseInt(entrada.nextLine());
		
		PROD = A * B;
		
		System.out.println("PROD = " + PROD);
	}

}
