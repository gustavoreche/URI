package URI;

import java.util.Scanner;

public class DividindoXporY {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int rep = Integer.parseInt(entrada.nextLine());
		
		for (int i = 0; i < rep; i++){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			double n1 = Integer.parseInt(str[0]);
			double n2 = Integer.parseInt(str[1]);
			double divisao = 0;
			
			if (n2 == 0){
				System.out.println("divisao impossivel");
			}
			else{
				divisao = n1 / n2;
				System.out.println(String.format("%.1f", divisao));
			}
		}
	}
}
