package URI;

import java.util.Scanner;

public class MaiorEPosicao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int lista [] = new int [100];
		int maior = 0;
		int posicao = 0;
		for(int i = 0; i < 100; i++){
			lista[i] = Integer.parseInt(entrada.nextLine());
			for(int a = 0; a <= i; a++){
				int teste = lista[i];
				if (teste > maior){
					maior = teste;
					posicao = i + 1;
				}
			}
		}
		
		System.out.println(maior);
		System.out.println(posicao);
	}
}
