package URI;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dia, ano = 0, mes = 0, rep = 1;
		
		dia = Integer.parseInt(entrada.nextLine());
		
		while(rep == 1){
			if(dia >= 365){
				ano = ano + 1;
				dia = dia - 365;
			}
			else if(dia >= 30){
				mes = mes + 1;
				dia = dia - 30;
			}
			else{
				rep = 2;
			}
		}
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}

}