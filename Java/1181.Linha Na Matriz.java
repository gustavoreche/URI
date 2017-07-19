package URI;

import java.util.Scanner;

public class LinhaNaMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double m1 [][] = new double [12][12];
		double soma = 0;
		int ver = Integer.parseInt(entrada.nextLine());
		String oper = entrada.nextLine();
		for (int l = 0; l < 12; l++){
			for (int c = 0; c < 12; c++){
				m1[l][c] = Double.parseDouble(entrada.nextLine());
			}
		}
		for (int i = 0; i < 12; i++){
			if (oper.equals("S")){
				soma = soma + m1[ver][i];
			}
			else{
				soma = soma + m1[ver][i];
			}
		}
		if (oper.equals("M")){
			soma = soma / 12;
		}
		System.out.println(String.format("%.1f", soma));
	}
}
