package URI;

import java.util.Scanner;

public class SequenciaDeNumerosESoma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int controle = 0;
		
		while (controle == 0){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			int n1 = Integer.parseInt(str[0]);
			int n2 = Integer.parseInt(str[1]);
			int soma = 0;
			
			if ((n1 <= 0) || (n2 <= 0)){
				controle = 1;
			}
			
			else if (n1 >= n2){
				int cont = n2 ;
				while (cont <= n1){
					System.out.print(cont + " ");
					soma = soma + cont;
					cont++;
				}
				System.out.print("Sum=" + soma);
				System.out.println("");
			}
			else{
				int cont = n1;
				while (cont <= n2){
					System.out.print(cont + " ");
					soma = soma + cont;
					cont++;
				}
				System.out.print("Sum=" + soma);
				System.out.println("");
			}
		}
	}
}
