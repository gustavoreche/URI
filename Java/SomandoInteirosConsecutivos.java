package URI;

import java.util.Scanner;

public class SomandoInteirosConsecutivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		int A = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);
		int AuxControle = 1;
		int i = 1;
		int memoria = 1;
		
		while (AuxControle == 1){
		if (N <= 0){
			i++;
			N = Integer.parseInt(str[i]);
			memoria = i;
				}
		else{
			AuxControle = 0;
				}
		}
		
		int AuxSoma = A;
		int soma = 0;
		N = Integer.parseInt(str[memoria]);
		int controle = N - 1;
		while (controle >= 0){
			AuxSoma = A + controle;
			soma = soma + AuxSoma;
			controle--;
		}
		System.out.println(soma);
	}
}