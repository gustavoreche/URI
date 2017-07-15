package URI;

import java.util.Scanner;

public class TipoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int alc = 0;
		int gas = 0;
		int die = 0;
		int control = 1;
		
		while(control != 4){
			int num = Integer.parseInt(entrada.nextLine());
			if (num == 1){
				alc++;
			}
			else if (num == 2){
				gas++;
			}
			else if (num == 3){
				die++;
			}
			else if (num == 4){
				control = 4;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
	}
}
