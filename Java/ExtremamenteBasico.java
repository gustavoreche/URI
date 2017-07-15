package URI;

import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		
		int a,b,x;
		
		Scanner entrada = new Scanner(System.in);
		
		a = Integer.parseInt(entrada.nextLine());
		b = Integer.parseInt(entrada.nextLine());
		
		x = a + b;
		
		System.out.println("X = " + x);
		
		
	}

}