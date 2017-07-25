package URI;

import java.util.Scanner;

public class AcimaDaDiagonalSecundaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double m1 [][] = new double [12][12];
		double soma = 0;
		String oper = entrada.nextLine();
		for (int l = 0; l < 12; l++){
			for (int c = 0; c < 12; c++){
				m1[l][c] = Double.parseDouble(entrada.nextLine());
			}
		}
		int a = 0, aux = 10;
		for (int i = 0; i < 12; i++){
			a = aux;
			int auxAux = 0;
			while (auxAux <= a){
				soma = soma + m1[i][auxAux];
				auxAux++;
			}
			aux--;
		}
		if (oper.equals("M")){
			soma = soma / 66;
		}
		System.out.println(String.format("%.1f", soma));
	}
}