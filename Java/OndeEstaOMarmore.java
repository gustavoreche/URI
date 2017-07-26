package URI;

import java.util.Arrays;
import java.util.Scanner;

public class OndeEstaOMarmore {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1 = 1, n2 = 1, cont = 1;
		
		while ((n1 != 0) && (n2 != 0)){
			if ((n1 != 0) && (n2 != 0)){
				String cod = entrada.nextLine();		
				String [] str = cod.split(" ");
				n1 = Integer.parseInt(str[0]);
				n2 = Integer.parseInt(str[1]);
				int laco = 0, posicao = 0;
				int [] v1 = new int [n1];
				int [] v2 = new int [n2];
				for (int i = 0; i < n1; i++){
					v1[i] = Integer.parseInt(entrada.nextLine());
				}
				for (int i = 0; i < n2; i++){
					v2[i] = Integer.parseInt(entrada.nextLine());
				}
				Arrays.sort(v1);
				if ((n1 != 0) && (n2 != 0)){
					System.out.println("CASE# " + cont +  ":");
				}
				for (int i = 0; i < n2; i++){
					laco = 0;
					for (int x = 0; x < n1; x++){
						if (v2[i] == v1[x]){
							posicao = x;
							laco = 1;
							x = n1 + 1;
						}
					}
					if (laco == 1){
						System.out.println(v2[i] + " found at " + (posicao + 1));
					}
					else{
						System.out.println(v2[i] + " not found");
					}
				}
				cont++;
			}
		}
	}
}