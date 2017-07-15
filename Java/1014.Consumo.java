package Maratona;

import java.util.Scanner;

public class E1014 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int km = Integer.parseInt(entrada.nextLine());
		
		double combustivel = Double.parseDouble(entrada.nextLine());
		
		double total = km / combustivel;
		
		System.out.println(String.format("%.3f km/l", total));
	}
}
