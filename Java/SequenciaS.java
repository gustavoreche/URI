package URI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SequenciaS {

	public static void main(String[] args) {
		
		double s = 0, somaAux = 0;
		for (double i = 1; i <= 100; i++){
			somaAux = 1 / i;
			s = s + somaAux;
		}
		BigDecimal bd = new BigDecimal(s).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println(bd);
	}
}