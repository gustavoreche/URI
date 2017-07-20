package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PreenchimentoDeVetorIII {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        double v1[] = new double[100];
        double num = Double.parseDouble(entrada.nextLine());
        for (int i = 0; i < 100; i++){
        	v1[i] = num;
        	num = num / 2;
        }
        for (int i = 0; i < 100; i++){
        	BigDecimal bd = new BigDecimal(v1[i]).setScale(4, RoundingMode.HALF_EVEN);
        	System.out.println("N[" + i + "] = " + bd);
        }
	}
}