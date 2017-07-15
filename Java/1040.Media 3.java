package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cod = entrada.nextLine();		
		String [] str = cod.split(" ");
		
		double n1 = Double.parseDouble(str[0]);
		double n2 = Double.parseDouble(str[1]);
		double n3 = Double.parseDouble(str[2]);
		double n4 = Double.parseDouble(str[3]);
		
		double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		 
		BigDecimal valorExato = new BigDecimal(media).setScale(1, RoundingMode.HALF_DOWN);
		System.out.println("Media: " + valorExato);
		
		if (media >= 7.0){
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0){
			System.out.println("Aluno reprovado.");
		}
		else{
			System.out.println("Aluno em exame.");
			double exame = Double.parseDouble(entrada.nextLine());
			System.out.println("Nota do exame: " + exame);
			media = (media + exame) / 2;
			if (media >= 5.0){
				System.out.println("Aluno aprovado.");
			}
			else{
				System.out.println("Aluno reprovado.");
			}
			BigDecimal valorExato1 = new BigDecimal(media).setScale(1, RoundingMode.HALF_DOWN);
			System.out.println("Media final: " + valorExato1);
		}
	}
}
