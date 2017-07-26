package URI;

import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {
		
		char [] letra = {' ', '!', '"', '#','$', '%', '&', '´', '(', ')', '*',
				'+', ',', '-', '.', '/', '0', '1', '2', '3', '4',
				'5', '6', '7', '8', '9', ':', ';', '<', '=', '>',
				'?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']',
				'^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
				'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{',
				'|', '}', '~',
		}; 
		
		Scanner entrada = new Scanner (System.in);
		int NumTeste = Integer.parseInt(entrada.nextLine());

		for (int i = 0; i < NumTeste; i++){
			String palavra =  entrada.nextLine();		
			int tamanho = palavra.length();
			char[] v1 = palavra.toCharArray();
			//1
			for (int x = 0; x < tamanho; x++){
				int posicao = x;
				if ((v1[x] != '!')&&(v1[x] != '"')&&(v1[x] != '#')&&(v1[x] != '$')&&
						(v1[x] != '%')&&(v1[x] != '&')&&(v1[x] != '´')&&(v1[x] != '(')&&
						(v1[x] != ')')&&(v1[x] != '*')&&(v1[x] != '+')&&(v1[x] != ',')&&
						(v1[x] != '-')&&(v1[x] != '.')&&(v1[x] != '/')&&(v1[x] != '0')&&
						(v1[x] != '1')&&(v1[x] != '2')&&(v1[x] != '3')&&(v1[x] != '4')&&
						(v1[x] != '5')&&(v1[x] != '6')&&(v1[x] != '7')&&(v1[x] != '8')&&
						(v1[x] != '9')&&(v1[x] != ':')&&(v1[x] != ';')&&(v1[x] != '<')&&
						(v1[x] != '=')&&(v1[x] != '>')&&(v1[x] != '?')&&(v1[x] != '@')&&
						(v1[x] != '[')&&(v1[x] != ']')&&(v1[x] != '^')&&(v1[x] != '_')&&
						(v1[x] != '`')&&(v1[x] != '{')&&(v1[x] != '|')&&(v1[x] != '}')&&
						(v1[x] != '~')&& (v1[x] != ' ')){
					for (int a = 0; a < 93; a++){
						if (v1[x] == (letra[a])){
							posicao = a;
							a = a + 95;
						}
					}
					posicao = posicao + 3;
					v1[x] = letra [posicao];
				}
			}
			//2
			palavra = String.copyValueOf(v1);
			StringBuffer inver = new StringBuffer(palavra);
			inver.reverse();
			palavra = inver.toString();
			v1 = palavra.toCharArray();
			//3
			int metade = tamanho / 2;
			for (int x = metade; x < tamanho; x++){
				int posicao = 0;
				for (int a = 0; a < 93; a++){
					if (v1[x] == (letra[a])){
						posicao = a;
						a = a + 95;
					}
				}
				if (posicao != 0){
					posicao = posicao - 1;
					v1[x] = letra [posicao];
				}
			}
			
			
			
			
			for (int x = 0; x < tamanho; x++){
				System.out.print(v1[x]);
			}
			System.out.println("");
		}
	}
}