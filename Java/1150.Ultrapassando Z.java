package URI;

import java.util.Scanner;

public class UltrapassandoZ {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int x = Integer.parseInt(entrada.nextLine());
		int controle = 1;
		int y = 0;
		
		while (controle == 1){
			y = Integer.parseInt(entrada.nextLine());
			if (y <= x){
				controle = 1;
			}
			else{
				controle = 0;
			}
		}
		int soma = 0;
		int cont = 0;
		while (soma < y){
			soma = soma + x;
			x = x + 1;
			cont = cont + 1;
		}
		System.out.println(cont);
	}
}
