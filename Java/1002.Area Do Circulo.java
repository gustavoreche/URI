package URI;
import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
		double raio, area;
        Scanner entrada = new Scanner (System.in);
        raio = Double.parseDouble(entrada.nextLine());
        area = ((raio*raio)*3.14159);
        System.out.println(String.format("A=%.4f", area));
	}
}
