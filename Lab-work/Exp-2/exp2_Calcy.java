import java.util.Scanner;

public class exp2_Calcy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers");
        
        System.out.print("a-> ");
        int a = sc.nextInt();
        System.out.print("b-> ");
        int b = sc.nextInt();

        System.out.println("Enter Operator");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+' -> System.out.println("a + b = "+(a+b));
            case '-' -> System.out.println("a - b = "+(a-b));
            case '*' -> System.out.println("a * b = "+(a*b));
            case '/' -> System.out.println("a/b = "+(a/b));
            default -> {
                System.out.println("Invalid Operator");
            }
        }
    }    
}


// import java.util.Scanner;

// public class exp2_snrCalcy {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter two numbers");
        
//         System.out.print("a-> ");
//         int a = sc.nextInt();
//         System.out.println("b-> ");
//         int b = sc.nextInt();

//         System.out.println("Enter Operator");
//         char ch = sc.next().charAt(0);

//         if (ch == '+') {
//             System.out.println("a + b = "+(a+b));
//         }
//         else if (ch == '-') {
//             System.out.println("a - b = "+(a-b));
//         }
//         else if (ch == '*') {
//             System.out.println("a * b = "+(a*b));
//         }
//         else if (ch == '/') {
//             System.out.println("a/b = "+(a/b));
//         }
//     }    
// }