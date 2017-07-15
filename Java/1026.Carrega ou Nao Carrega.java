package URI;
import java.util.Scanner;
public class teste {
    public static void main(String[] args){ 

    Scanner sc = new Scanner(System.in);
    long x, y, ans;  

  while (sc.hasNext()) {  

        x = sc.nextLong(); 

        y = sc.nextLong(); 

        ans = x^y; 

        System.out.println(ans); 

        } 

    }
}
