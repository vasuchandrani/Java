
import java.util.Scanner;

public class exp2_Factorial {
    
    int solve (int n) {
        if (n == 0) {
            return 1;
        }

        int fact = n * solve (n - 1);
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        exp2_Factorial exp = new exp2_Factorial();
        int factorial = exp.solve (n);

        System.out.println("factorial = "+factorial );
    }
    
}
