package URI;

import java.util.Scanner;

public class ConversaoDeTempo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int N = Integer.parseInt(entrada.nextLine());
		
		int rep = 0, tempo = N, hora = 0, min = 0, seg = 0;
		while(rep == 0){
			if (tempo >= 3600){
				tempo = tempo - 3600;
				hora++;
			}
			else if (tempo >= 60){
				tempo = tempo - 60;
				min++;
			}
			else {
				seg = tempo;
				rep = 2;
			}
		}
		System.out.println(hora + ":" + min + ":" + seg);
	}
}