package URI;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int rep = Integer.parseInt(entrada.nextLine());
		double [] ListaMedia = new double [rep];
		for (int i = 0; i < rep; i++){
			String cod = entrada.nextLine();		
			String [] str = cod.split(" ");
			double n1 = Double.parseDouble(str[0]);
			double n2 = Double.parseDouble(str[1]);
			double n3 = Double.parseDouble(str[2]);
			
			double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
			ListaMedia[i] = media;
		}
		for (int i = 0; i < rep; i++){
			BigDecimal bd = new BigDecimal(ListaMedia[i]).setScale(1, RoundingMode.HALF_EVEN);
			System.out.println(bd.doubleValue());

		}
	}
}