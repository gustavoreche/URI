package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SequenciaIJ4 {

	public static void main(String[] args) {
		
		double j = 1;
		double i = 0;
		for (int cont = 0; cont < 11; cont++){
			for (int contAux = 0; contAux < 3; contAux++){
				BigDecimal bd = new BigDecimal(j).setScale(1, RoundingMode.HALF_EVEN);
				BigDecimal bdI = new BigDecimal(i).setScale(1, RoundingMode.HALF_EVEN);
				if ((i == 0.00)||(i == 1.00)){
					System.out.print(String.format("I=%.0f", i));
					System.out.print(String.format(" J=%.0f", j));
					System.out.println("");
				}
				else if ((i >= 1.9) && (i <= 2.0)){
					System.out.print(String.format("I=%.0f", i));
					System.out.print(String.format(" J=%.0f", j));
					System.out.println("");
				}
				else{
					System.out.println("I=" + bdI + " J=" + bd);
				}
				j = j + 1;
			}
			j = (j + 0.2) - 3;
			i = i + 0.2;
		}
	}
}