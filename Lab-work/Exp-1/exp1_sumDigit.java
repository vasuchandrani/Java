
import java.util.Scanner;

public class exp1_sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String num = Integer.toString(n);
        int sum = 0;
        for (int i=0; i<num.length(); i++) {
            int digi = num.charAt(i) - '0';
            sum += digi;
        }
        System.out.println("sum = "+sum);   
    }
}
