package URI;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double A,B,C, MEDIA;
		
		A = Double.parseDouble(entrada.nextLine());
		B = Double.parseDouble(entrada.nextLine());
		C = Double.parseDouble(entrada.nextLine());
		
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		System.out.println(String.format("MEDIA = %.1f",MEDIA));
	}

}
