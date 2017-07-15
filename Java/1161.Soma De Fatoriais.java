package URI;

import java.util.Scanner;

public class SomaDeFatoriais {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		while (entrada.hasNext()) {
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			long n1 = Integer.parseInt(str[0]);
			long n2 = Integer.parseInt(str[1]);
			long nf1 = 0;
			long nf2 = 0;
			
			if (n1 == 0){
				nf1 = 1;
			}
			if (n2 == 0){
				nf2 = 1;
			}	
			if (n1 != 0){
				long aux1 = n1 - 1;
				nf1 = n1;
				for (long i = n1; i > 1; i--){
					nf1 = nf1 * aux1; 
					aux1--;
				}
			}
			if (n2 != 0){
				long aux2 = n2 - 1;
				nf2 = n2;
				for (long i = n2; i > 1; i--){
					nf2 = nf2 * aux2; 
					aux2--;
				}
			}
			long total = nf1 + nf2;
			System.out.println(total);
		}
	}
}
