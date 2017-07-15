package URI;

import java.util.Scanner;

public class MultiplosDe13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1 = Integer.parseInt(entrada.nextLine());
		int n2 = Integer.parseInt(entrada.nextLine());
		int soma = 0;
		
		if (n2 > n1){
			for(int i = n1; i <= n2; i++){
				if (i % 13 != 0){
					soma = soma + i;
				}
			}
		}
		else if (n1 > n2){
			for(int i = n2; i <= n1; i++){
				if (i % 13 != 0){
					soma = soma + i;
				}
			}
		}
		System.out.println(soma);
	}
}