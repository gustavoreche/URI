package URI;

import java.util.Scanner;

public class Mjolnir {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int NumTeste = Integer.parseInt(entrada.nextLine());
		for (int i = 0; i < NumTeste; i++){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			String nome = str[0];
			int n1 = Integer.parseInt(str[1]);
			 if (nome.equals("Thor")){
				 System.out.println("Y");
			 }
			 else{
				 System.out.println("N");
			 }
		}
	}
}