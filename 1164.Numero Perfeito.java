package URI;

import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int rep = entrada.nextInt();
		for (int i = 0; i < rep; i++){
			int num = entrada.nextInt();
			int soma = 0;
			for (int x = 1; x <= num; x++){
				int conta = num % x;
				if (conta == 0){
					if (num == x){
						
					}
					else{
						soma = soma + x;
					}
				}
			}
			if (soma == num){
				System.out.println(num + " eh perfeito");
			}
			else{
				System.out.println(num + " nao eh perfeito");
			}
		}
	}
}
