package URI;

import java.util.Scanner;

public class oMaior {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String cod = entrada.nextLine();
		String[] str = cod.split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		int resultado = (a + b + Math.abs(a - b)) / 2;
		int fim = (resultado + c + Math.abs(resultado - c)) / 2;
	
		
		System.out.println(fim + " eh o maior");
	}
}
