package URI;

import java.util.Scanner;

public class NossosDiasNuncaVoltarao {

	public static void main(String[] args) {
		
		String palavra [] = {"L", "I", "F", "E", " ", "I", "S", " ", "N", "O",
				"T", " ", "A", " ", "P", "R", "O", "B", "L", "E", "M", " ", "T",
				"O", " ", "B", "E", " ", "S", "O", "L", "V", "E", "D"};
		Scanner entrada = new Scanner(System.in);
		int num = Integer.parseInt(entrada.nextLine());
		if ((num >= 1) && (num <= 34)){
			num = num - 1;
			for (int i = 0; i <= num; i++){
				System.out.print(palavra[i]);
			}
			System.out.println("");
		}
	}
}
