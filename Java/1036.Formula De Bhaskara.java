package URI;

import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		String cod = entrada.nextLine();
		  
		String[] str = cod.split(" "); 
		
		double a, b, c, quadrado, raiz, x1, x2, delta, total = 0;
		
		a = Double.parseDouble(str[0]);
		b = Double.parseDouble(str[1]);
		c = Double.parseDouble(str[2]);
		
		quadrado = Math.pow(b, 2);
		
		delta = quadrado - (4 * a * c);
		
		raiz = Math.sqrt(delta);
		
		x1 = (-(b) + raiz) / (2 * a);
		x2 = (-(b) - raiz) / (2 * a);
		
		if((delta < 0) || (a == 0)){
			System.out.println("Impossivel calcular");
		}
		else{
			System.out.println(String.format("R1 = %.5f",x1));
			System.out.println(String.format("R2 = %.5f",x2));
		}
	}
}
