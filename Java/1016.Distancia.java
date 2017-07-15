package URI;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int km = Integer.parseInt(entrada.nextLine());
		
		int total = km * 2;
		
		System.out.println(total + " minutos");
	}
}
