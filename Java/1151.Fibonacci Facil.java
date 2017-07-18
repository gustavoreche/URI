package URI;

import java.util.Scanner;

public class FibonacciFacil {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n = Integer.parseInt(entrada.nextLine());
		int num1 = 0, num2 = 1, numFinal = 1;
		System.out.print(num1 + " ");
		n = n - 2;
		for (int i = 0; i < n; i++){
			if ((n > 0) && (n < 46)){
				System.out.print(numFinal + " ");
				numFinal = num1 + num2;
				num1 = num2;
				num2 = numFinal;
			}
		}
		System.out.print(numFinal);
		System.out.println("");
	}
}
