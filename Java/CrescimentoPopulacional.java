package URI;

import java.util.Scanner;

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int rep = Integer.parseInt(entrada.nextLine());
		int PA = 0;
		int PB = 0;
		double G1 = 0;
		double G2 = 0;
		double somaA = 0;
		double somaB = 0;
		for (int i = 0; i < rep; i++){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			
			PA = Integer.parseInt(str[0]);
			PB = Integer.parseInt(str[1]);
			G1 = Double.parseDouble(str[2]);
			G2 = Double.parseDouble(str[3]);
			
			int cont = 0;
			while (PA <= PB){
				somaA = (PA * G1) / 100;
				somaB = (PB * G2) / 100;
				PA = PA + (int)somaA;
				PB = PB + (int)somaB;
				cont++;
			}
			
			if (cont > 100){
				System.out.println("Mais de 1 seculo.");
			}
			else{
				System.out.println(cont + " anos.");
			}
		}
	}
}