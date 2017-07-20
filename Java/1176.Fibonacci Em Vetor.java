package URI;

import java.util.Scanner;

public class FibonacciEmVetor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		long v1[] = new long[61];
    	long nAux = 1, n1 = 1, n2 = 1;
    	v1[0] = 0;
    	v1[1] = 1;
    	for (int a = 2; a < 61; a++){
    		v1[a] = nAux;
    		nAux = n1 + n2;
    		n1 = n2;
    		n2 = nAux;
    	}
        int rep = Integer.parseInt(entrada.nextLine());
        for (int x = 0; x < rep; x++){
        	int num = Integer.parseInt(entrada.nextLine());
        	if ((num >= 0) && (num <= 60)){
            	System.out.println("Fib(" + num + ") = " + v1[num]);
        	}
        }
	}
}
