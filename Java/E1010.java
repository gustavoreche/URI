package Maratona;

import java.util.Scanner;

public class E1010 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double [] valor = new double [2];
		
		int i = 0;		
		while(i < 2){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			
			int codigo = Integer.parseInt(str[0]);
			
			int numero = Integer.parseInt(str[1]);
					
			valor[i] = Double.parseDouble(str[2]);
			valor[i] = valor[i] * numero;
			
			i++;
		}
		
		double total = valor[0] + valor[1];
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
	}
}