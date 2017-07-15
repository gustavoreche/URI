package URI;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		while (leia.hasNext()) {
		         int num = Integer.parseInt(leia.nextLine());
		         int senha = num - 1;
		         System.out.println(senha);
		}
		
	}
}