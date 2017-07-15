package URI;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Patinhos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		BigInteger num = BigInteger.valueOf(1);
		
		while(num.equals(BigInteger.valueOf(1))){
			num = entrada.nextBigInteger();
			
			if (num.equals(BigInteger.valueOf(-1))){
				num = BigInteger.valueOf(-1);
			}
			else if(num.equals(BigInteger.valueOf(0))){
				System.out.println(num);
				num = BigInteger.valueOf(1);
			}
			else{
				BigInteger teste = BigInteger.valueOf(1);
				BigInteger saida;
				saida = num.subtract(teste);
				System.out.println(saida);
				num = BigInteger.valueOf(1);
			}
		}
	}
}