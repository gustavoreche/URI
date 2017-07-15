package URI;

import java.util.Scanner;

public class RestoDaDivisao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1 = Integer.parseInt(entrada.nextLine());
		int n2 = Integer.parseInt(entrada.nextLine());
		
		if (n2 > n1){
			for(int i = n1 + 1 ; i < n2; i++){
				if ((i % 5 == 2) || (i % 5 == 3)){
					System.out.println(i);
				}
			}
		}
		else if (n1 > n2){
			for(int i = n2 + 1 ; i < n1; i++){
				if ((i % 5 == 2) || (i % 5 == 3)){
					System.out.println(i);
				}
			}
		}
	}
}
