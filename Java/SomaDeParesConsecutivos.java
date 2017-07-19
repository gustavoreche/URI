package URI;

import java.util.Scanner;

public class SomaDeParesConsecutivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);		
		int rep = 1;
		while (rep != 0){
			int repeticao = 5, soma = 0;
			 rep = Integer.parseInt(entrada.nextLine());
			if (rep != 0){
				for (int x = 1; x <= repeticao; x++){
					 if (rep % 2 == 0){
						 soma = soma + rep;
					 }
					 else{
						 repeticao++;
					 }
					 rep++;
				 }
				System.out.println(soma);
			}
		}
	}
}