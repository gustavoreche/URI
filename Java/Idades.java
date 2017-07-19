package URI;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double idade = 1, soma = 0, cont = 0;
		while (idade >= 0){
			idade = Integer.parseInt(entrada.nextLine());
			if (idade >= 0){
				soma = soma + idade;
						cont++;
			}
		}
		double total = soma / cont;
		System.out.println(String.format("%.2f", total));
	}
}