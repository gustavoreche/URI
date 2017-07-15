package URI;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		double horas, valor, salario;
		
		numero = Integer.parseInt(entrada.nextLine());
		horas = Double.parseDouble(entrada.nextLine());
		valor = Double.parseDouble(entrada.nextLine());
		
		salario = horas * valor;
		
		System.out.println("NUMBER = " + numero);
		System.out.println(String.format("SALARY = U$ %.2f", salario));
	}
}