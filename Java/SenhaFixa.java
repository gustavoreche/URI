package URI;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int controle = 0;
		
		while (controle == 0){
			int senha = Integer.parseInt(entrada.nextLine());
			if (senha == 2002){
				controle = 1;
				System.out.println("Acesso Permitido");
			}
			else{
				System.out.println("Senha Invalida");
			}
		}
	}
}