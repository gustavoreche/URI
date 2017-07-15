package URI;

import java.util.Scanner;

public class TesteSelecao1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String cod = entrada.nextLine();
		  
		String[] str = cod.split(" ");
		
		int A, B, C, D, somaCD, somaAB, modA;
		
		A = Integer.parseInt(str[0]);
		B = Integer.parseInt(str[1]);
		C = Integer.parseInt(str[2]);
		D = Integer.parseInt(str[3]);
		
		somaCD = C + D;
		somaAB = A + B;
		modA = A % 2;
		
		if((B > C) && (D > A) && (somaCD > somaAB) && (C > 0) && (D > 0) && (modA == 0)){
			System.out.println("Valores aceitos");
		}
		else{
			System.out.println("Valores nao aceitos");
		}
	}
}