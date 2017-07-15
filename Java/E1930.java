package Maratona;

import java.util.Scanner;

public class E1930 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		
		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		int n3 = Integer.parseInt(str[2]);
		int n4 = Integer.parseInt(str[3]);
		
		int total = (n1+n2+n3+n4) - 3;
		
		System.out.println(total);
	}
}
