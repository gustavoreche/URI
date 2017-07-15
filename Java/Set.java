package URI;

import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int rep = 1, rep1 = 1;
		//Colocando o numero de linhas
		while(rep == 1){
			int Nlinhas = Integer.parseInt(entrada.nextLine());
			//Finalizando o programa
			if(Nlinhas == 0){
				rep = 2;
			}
			//Digitando o que tem em cada linha
			else{
				while (rep1 <= Nlinhas){
					String cod = entrada.nextLine();
					String[] str = cod.split(" ");
					//Verificando se o que está escrito está correto
					if((str[0].equals("um")) || (str[0].equals("dois")) || (str[0].equals("tres"))){
						if((str[1].equals("circulo"))||(str[1].equals("circulos"))||(str[1].equals("quadrado"))||(str[1].equals("quadrados"))||(str[1].equals("triangulo"))||(str[1].equals("triangulos"))){
							//Armazenando as formas (circulo/quadrado/triangulo)
							String [] vetor = new String [Nlinhas];
							for(int x = 0; x < Nlinhas; x++){
								vetor[x] = str[1];
							}
							//Lendo as formas
							for(int y = 0; y < Nlinhas; y++){
								if((vetor[y].equals("circulo"))||(vetor[y].equals("circulos"))){
									
								}
							}
						}
					}
					rep1++;
				}
				rep1 = 1;
			}
		}
	}
}
