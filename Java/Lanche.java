package URI;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		String cod = entrada.nextLine();
		  
		String[] str = cod.split(" "); 
		
		double total = 0;
		int qt;

		if (str[0].equals("1")){
			qt = Integer.parseInt(str[1]);
			total = qt * 4.00;
		}
		else if (str[0].equals("2")){
			qt = Integer.parseInt(str[1]);
			total = qt * 4.50;
		}
		else if (str[0].equals("3")){
			qt = Integer.parseInt(str[1]);
			total = qt * 5.00;
		}
		else if (str[0].equals("4")){
			qt = Integer.parseInt(str[1]);
			total = qt * 2.00;
		}
		else if (str[0].equals("5")){
			qt = Integer.parseInt(str[1]);
			total = qt * 1.50;
		}
		System.out.println(String.format("Total: R$ %.2f",total));
	}
}
