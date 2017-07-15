package Maratona;

import java.io.*;
import java.util.Scanner;

public class E1170 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		
		while ((linha = br.readLine()) != null) {
	            int n = Integer.parseInt(linha);
	            Scanner entrada = new Scanner(System.in);

				String cod = entrada.nextLine();		
				String [] str = cod.split(" ");
			
				int M = Integer.parseInt(str[0]);
				int N = Integer.parseInt(str[1]);
					
				int cont = 1;
				int rep = 1;
				while(rep <= M){
					cont = rep * cont;
					rep++;
				}
					
				rep = 1;
				int cont1 = 1;
				while(rep <= N){
					cont1 = rep * cont1;
					rep++;
				}
				
				int total = cont + cont1;
			
				System.out.println(total);
		}		
	}
}