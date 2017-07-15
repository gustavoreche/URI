package Maratona;

import java.util.Scanner;

public class E1018 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor = Integer.parseInt(entrada.nextLine());
		int valortotal = valor;
		
		int cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0;
		
		int rep = 1;
		while (rep == 1){
			if (valor >= 100){
				valor = valor - 100;
				cont100++;
			}
			else if (valor >= 50){
				valor = valor - 50;
				cont50++;
			}
			else if (valor >= 20){
				valor = valor - 20;
				cont20++;
			}
			else if (valor >= 10){
				valor = valor - 10;
				cont10++;
			}
			else if (valor >= 5){
				valor = valor - 5;
				cont5++;
			}
			else if (valor >= 2){
				valor = valor - 2;
				cont2++;
			}
			else if (valor >= 1){
				valor = valor - 1;
				cont1++;
			}
			else if (valor == 0){
				rep = 2;
			}
		}
		
		System.out.println(valortotal);
		System.out.println(cont100 + " nota(s) de R$ 100,00");
		System.out.println(cont50+ " nota(s) de R$ 50,00");
		System.out.println(cont20+ " nota(s) de R$ 20,00");
		System.out.println(cont10+ " nota(s) de R$ 10,00");
		System.out.println(cont5 + " nota(s) de R$ 5,00");
		System.out.println(cont2 + " nota(s) de R$ 2,00");
		System.out.println(cont1 + " nota(s) de R$ 1,00");
	}
}