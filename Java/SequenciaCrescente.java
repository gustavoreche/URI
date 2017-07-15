package URI;

import java.util.Scanner;

public class SequenciaCrescente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int num = 1;
		while (num != 0){
			num = Integer.parseInt(entrada.nextLine());
			if (num == 0){
				num = 0;
			}
			else{
				int acrescentar = 0;
				for (int i = 1; i < num; i++){
					System.out.print(i + " ");
					acrescentar = i;
				}
				acrescentar = acrescentar + 1;
				System.out.print(acrescentar);
				System.out.println("");
			}
		}
	}
}