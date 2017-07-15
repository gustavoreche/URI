package URI;

import java.util.Scanner;

public class VariasNotasComValidacao {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		int reset = 1;		
		while (reset == 1){
			double n1 = 11;
			double n2 = 11;
			while ((n1 < 0) || (n1 > 10)){
				n1 = Double.parseDouble(entrada.nextLine());
				if ((n1 < 0) || (n1 > 10)){
					System.out.println("nota invalida");
				}
			}
			while ((n2 < 0) || (n2 > 10)){
				n2 = Double.parseDouble(entrada.nextLine());
				if ((n2 < 0) || (n2 > 10)){
					System.out.println("nota invalida");
				}
			}
			double media = (n1 + n2) / 2;
			System.out.println(String.format("media = %.2f", media));
			int res = 3;
			while (res == 3){
				System.out.println("novo calculo (1-sim 2-nao)");
				res = Integer.parseInt(entrada.nextLine());
				if (res == 1){
					reset = 1;
				}
				else if (res == 2){
					reset = 2;
				}
				else {
					res = 3;
				}				
			}
		}
	}
}
