package URI;

import java.util.Scanner;

public class SomaDeImparesConsecutivosIII {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int rep = Integer.parseInt(entrada.nextLine());
		for (int i = 0; i < rep; i++){
			int soma = 0;
			 String cod = entrada.nextLine();		
			 String [] str = cod.split(" ");
			 int n1 = Integer.parseInt(str[0]);
			 int n2 = Integer.parseInt(str[1]);
			 
			 for (int x = 1; x <= n2; x++){
				 if (n1 % 2 == 0){
					 n2++;
				 }
				 else{
					 soma = soma + n1;
				 }
				 n1++;
			 }
			 System.out.println(soma);
		}
	}
}
