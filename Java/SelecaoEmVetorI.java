package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SelecaoEmVetorI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        double v1[] = new double[100];
        for (int i = 0; i < 100; i++){
        	double num = Double.parseDouble(entrada.nextLine());
        	v1[i] = num;
        }
        for (int i = 0; i < 100; i++){
        	if (v1[i] <= 10){
        		BigDecimal bd = new BigDecimal(v1[i]).setScale(1, RoundingMode.HALF_EVEN);
            	System.out.println("A[" + i + "] = " + bd);
        	}
        }
	}
}