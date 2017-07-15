package URI;

import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double tempo = Double.parseDouble(entrada.nextLine());
		double km = Double.parseDouble(entrada.nextLine());
		
		double total = (tempo * km) / 12;
		
		System.out.println(String.format("%.3f", total));
	}
}