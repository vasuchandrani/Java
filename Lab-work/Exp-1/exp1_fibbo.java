
import java.util.Scanner;

public class exp1_fibbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = a + b;
        if (n == 1) {
            System.out.print(a);
            System.exit(0);
        }
        if (n == 2) {
            System.out.print(a );
            System.out.println(b);
            System.exit(0);
        }
        
        System.out.print(a );
        System.out.print(b );    
        for (int i=2; i<n; i++) {
            System.out.print(c );
            a = b;
            b = c;
            c = a + b;
        }
    }    
}
