package URI;

import java.util.Scanner;

public class FatorialSimples {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n = Integer.parseInt(entrada.nextLine());
		if ((n > 0) && (n < 13)){
			int nAux = n;
			int soma = 0;
			n = n - 1;
			while (n != 0){
				soma = nAux * n;
				nAux = soma;
				n--;
			}
			System.out.println(soma);
		}
	}
}