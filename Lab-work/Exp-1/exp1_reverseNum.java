import java.util.Scanner;

public class exp1_reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = Integer.toString(n);
        
        // String s = sc.nextLine();
        String reversed = new StringBuffer(s).reverse().toString();

        System.out.println(reversed);
    }
}