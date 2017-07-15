package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Experiencia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int NumTeste = Integer.parseInt(entrada.nextLine());
		int total = 0;
		int totalC = 0;
		int totalR = 0;
		int totalS = 0;
		for (int i = 0; i < NumTeste; i++){
			 String cod = entrada.nextLine();		
			 String [] str = cod.split(" ");
			 int QuantTeste = Integer.parseInt(str[0]);
			 total = total + QuantTeste;
			 if (str[1].equals("C")){
				 totalC = totalC + QuantTeste;
			 }
			 else if (str[1].equals("R")){
				 totalR = totalR + QuantTeste;
			 }
			 else{
				 totalS = totalS + QuantTeste;
			 }
		 }
		double percC = (((double)totalC * 100) / total);
		double percR = (((double)totalR * 100) / total);
		double percS = (((double)totalS * 100) / total);
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + totalC);
		System.out.println("Total de ratos: " + totalR);
		System.out.println("Total de sapos: " + totalS);
		BigDecimal bd = new BigDecimal(percC).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Percentual de coelhos: " + bd + " %");
		BigDecimal bd1 = new BigDecimal(percR).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Percentual de ratos: " + bd1 + " %");
		BigDecimal bd2 = new BigDecimal(percS).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("Percentual de sapos: " + bd2 + " %");
	}
}