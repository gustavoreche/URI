package URI;

import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {
		
		double A,B,MEDIA;
		
		Scanner entrada = new Scanner(System.in);
		
		A = Double.parseDouble(entrada.nextLine());
		B = Double.parseDouble(entrada.nextLine());
		
		MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.println(String.format("MEDIA = %.5f", MEDIA));
	}

}
