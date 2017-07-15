package URI;

import java.util.Scanner;

public class SequenciaLogica2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		int cont = 1;
		while (n2 != 0){
			for(int i = 1; i <= n1; i++){
				System.out.print(cont);
				if (i == n1){
					i = i;
				}
				else{
					System.out.print(" ");
				}
				cont++;
				n2--;
			}
			System.out.println("");
		}
	}
}
