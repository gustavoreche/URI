package URI;

import java.util.Scanner;

public class MatrizQuadradaI {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int controle = 1;
		while (controle != 0){
			controle = Integer.parseInt(entrada.nextLine());
			if ((controle >= 0) && (controle <= 100)){
				if (controle != 0){
					int cont = 1;
					int m1 [][] = new int [controle][controle];
					for (int l = 0; l < controle; l++){
						for (int c = 0; c < controle; c++){
							m1[l][c] = cont;
						}
					}
					int contIni = 0;
					int contFin = controle - 1;
					int teste = 0;
					teste = controle - 2;
					while (teste > 0){
						for (int a = cont; a < controle; a++){
							for (int b = cont; b < controle; b++){
								m1[a][b] = cont + m1[a][b];
								if ((a <= contIni) || (b >= contFin) || (b <= contIni) || (a >= contFin)){
									m1[a][b] = m1[a][b] - cont;
								}
							}
						}
						contIni++;
						contFin--;
						teste = teste - 2;
					}
					//MOSTRAR MATRIZ
					int cond = 0;
					for (int l = 0; l < controle; l++){
						System.out.print(" ");
						for (int c = 0; c < controle; c++){
							if (c == (controle - 1)){
								System.out.print(" " + m1[l][c]);
							}
							else{
								if (m1[l][c] >= 9){
									if (m1[l][c] >= 10){
										System.out.print(m1[l][c] + "  ");
										}
									else if (m1[l][c] == 9){
										System.out.print(" " + m1[l][c] + "  ");
									}
									else{
										System.out.print(" " + m1[l][c] + "  ");
									}
								}
								else{
									System.out.print(" " + m1[l][c] + "  ");
								}
							}
						}
						System.out.println("");
					}
					System.out.println("");
				}
			}
			else{
				controle = 0;
			}
		}
	}
}