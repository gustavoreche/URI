package URI;

import java.util.Scanner;

public class ARespostaDeTheon {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num = Integer.parseInt(entrada.nextLine());
		int [] v1 = new int [num];
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		int menor = 100000, posicao = 0;
		for (int i = 0; i < num; i++){
			v1[i] = Integer.parseInt(str[i]);
			if (menor > v1[i]){
				menor = v1[i];
				posicao = i;
			}
		}
		
		System.out.println(posicao + 1);
	}
}