import java.util.Scanner;

public class exp2_FibonacciNth {

    int solve (int n) {
                
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0;  int b = 1;

        int term = 0;
        for (int i=2; i<n; i++) {
            int c = a + b;
            term = c;
            a = b;
            b = c;
        }
        return term;        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term of Fibbonaci series: ");
        int n = sc.nextInt();

        exp2_FibonacciNth exp = new exp2_FibonacciNth();
        int term = exp.solve(n);

        System.out.println(term);
    }
}
