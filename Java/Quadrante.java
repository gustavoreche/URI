package URI;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int controle = 0;
		
		while (controle == 0){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			if ((x == 0) || (y == 0)){
				controle = 1;
			}
			else if (x > 0){
				if (y > 0){
					System.out.println("primeiro");					
				}
				else{
					System.out.println("quarto");
				}
			}
			else{
				if (y > 0){
					System.out.println("segundo");
				}
				else{
					System.out.println("terceiro");
				}
			}
		}
	}
}