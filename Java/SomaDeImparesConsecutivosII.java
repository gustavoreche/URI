package URI;

import java.util.Scanner;

public class SomaDeImparesConsecutivosII {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int rep = Integer.parseInt(entrada.nextLine());
		
		for (int i = 0; i < rep; i++){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			int n1 = Integer.parseInt(str[0]);
			int n2 = Integer.parseInt(str[1]);
			int soma = 0;
			
			if (n1 >= n2){
				int cont = n2 + 1;
				while (cont < n1){
					if (cont % 2 == 0){
						int a = 0;
					}
					else{
						soma = soma + cont;
					}
					cont++;
				}
			}
			else{
				int cont = n1 + 1;
				while (cont < n2){
					if (cont % 2 == 0){
						int a = 0;
					}
					else{
						soma = soma + cont;
					}
					cont++;
				}
			}
			System.out.println(soma);
		}
	}
}