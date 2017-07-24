package URI;

import java.util.Scanner;

public class Prefacio {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int q = 0, r = 0;
        
        for (r = 0; r < Math.abs(b); ++r) {
            if (((a - r) % b) == 0) {
              q = (a - r) / b;
              break;
            }
          }
        System.out.println(q + " " + r);
      }
   }
