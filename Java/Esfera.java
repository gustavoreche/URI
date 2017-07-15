package URI;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio = Double.parseDouble(entrada.nextLine());
		double pi = 3.14159;
		double cubo = Math.pow(raio, 3);
		
		double volume = (4/3.0) * pi * cubo;
		
		System.out.println(String.format("VOLUME = %.3f",volume));
	}
}