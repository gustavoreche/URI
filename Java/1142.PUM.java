package Maratona;

import java.util.Scanner;

public class E1142 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int linha = Integer.parseInt(entrada.nextLine());
		
		int num = 1;
		int x = 1;
		while (x <= linha){
			int cont = 1, rep = 1;
			while(rep <= 4){
				if (cont == 4){
					System.out.println("PUM");
				}
				else{
					System.out.print(num + " ");
				}
				num++;
				cont++;
				rep++;
			}
			x++;
		}
	}
}
