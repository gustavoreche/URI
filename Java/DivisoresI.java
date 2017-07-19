package URI;

import java.util.Scanner;

public class DivisoresI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int num = Integer.parseInt(entrada.nextLine());
		int cont = 0;
		for (int i = 1; i <= num; i++){
			if (num % i == 0){
				System.out.println(i);
			}
		}
	}
}