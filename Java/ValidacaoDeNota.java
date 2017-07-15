package URI;

import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int controle = 2;
		int rep = 0;
		double soma = 0;
		
		while (controle > rep){
			double nota = Double.parseDouble(entrada.nextLine());
			
			if ((nota < 0) || (nota > 10)){
				System.out.println("nota invalida");
			}
			else{
				soma = soma + nota;
				rep++;
			}
		}
		double media = soma / 2;
		System.out.println(String.format("media = %.2f", media));
	}
}