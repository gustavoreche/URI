package URI;

import java.util.Scanner;

public class QuadradoAoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num = Integer.parseInt(entrada.nextLine());
		
		for (int i = 1; i <= num; i++){
			int aux = i * i;
			int total = aux * i;
			System.out.println(i + " " + aux + " " + total);
		}
	}
}
