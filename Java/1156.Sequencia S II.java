package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SequenciaSII {

	public static void main(String[] args) {
		
		// S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
		
		double s = 0, somaAux = 0, b = 1;
		for (double i = 1; i <= 39; i = i + 2){
			somaAux = i / b;
			s = s + somaAux;
			b = b * 2;
		}
		BigDecimal bd = new BigDecimal(s).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println(bd);
	}
}
