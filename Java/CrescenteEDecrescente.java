package URI;

import java.util.Scanner;

public class CrescenteEDecrescente {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner (System.in);
		
		int controle = 0;
		
		while (controle == 0){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			int n1 = Integer.parseInt(str[0]);
			int n2 = Integer.parseInt(str[1]);
			
			if (n1 == n2){
				controle = 1;
			}
			
			else if (n1 >= n2){
				System.out.println("Decrescente");
			}
			else{
				System.out.println("Crescente");
			}
		}
	}
}