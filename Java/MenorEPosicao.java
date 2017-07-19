package URI;

import java.util.Scanner;

public class MenorEPosicao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int tam = Integer.parseInt(entrada.nextLine());
		int v1 [] = new int [tam];
		int menor = 1000000, posicao = 0;
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		for (int x = 0; x < tam; x++){
			v1[x] = Integer.parseInt(str[x]);
			if (v1[x] < menor){
				menor = v1[x];
				posicao = x;
			}
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
	}
}