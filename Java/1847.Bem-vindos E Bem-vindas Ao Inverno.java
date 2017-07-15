package Maratona;

import java.util.Scanner;

public class E1847 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
		//1
		if ((A > B) && (B <= C)){
			System.out.println(":)");
		}
		//2
		else if ((A < B) && (B >= C)){
			System.out.println(":(");
		}
		//3 e 4
		else if ((A < B) && (B < C)){
//			if ((A < 0) || (B < 0) || (C < 0)){
//				int teste1 = B - A;
//				int teste2 = C - B;
//			}
			int teste1 = B - A;
			int teste2 = C - B;
			if (teste1 > teste2){
				System.out.println(":(");
			}
			else{
				System.out.println(":)");
			}
		}
		//5 e 6
		else if ((A > B) && (B > C)){
			int teste1 = B - C;
			int teste2 = A - B;
			if (teste1 < teste2){
				System.out.println(":)");
			}
			else{
				System.out.println(":(");
			}
		}
		//7
		else if ((A == B) && (B < C)){
			System.out.println(":)");
		}
		//8
		else if ((A == B) && (B >= C)){
			System.out.println(":(");
		}
	}
}
