package URI;

import java.util.Scanner;

public class PoucaFrequencia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int teste = Integer.parseInt(entrada.nextLine());
		
		int x = 1;
		while (x <= teste){
			int aluno = Integer.parseInt(entrada.nextLine());
			int z = 1;
			while (z < aluno){
				
				String nome = entrada.nextLine();
				String [] str = nome.split(" ");
				
				String pre = entrada.nextLine();
				String [] str1 = pre.split(" ");
				
				int y = 0;
				while(y < aluno){
					double total = 0, contP = 0, contA = 0, contaA = 0, contaP = 0;
					for(int i = 0; i < str1[y].length(); i++){
					   char c = str1[y].charAt(i);
					   String conv = "" + c;
					   
					   if (conv.equals("P")){
							contP++;
						}
						else if(conv.equals("M")){
							contP++;
						}
						else{
							contA++;
						}
					}
					total = contA + contP;
					contaA = (contA / total) * 100;
					contaP = (contP / total) * 100;
					
					if(contaP <= 75){
						System.out.print(str[y] + " ");
					}
					y++;				
				} z++;
			} x++;
		}
	}
}