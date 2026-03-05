import java.util.Scanner;

public class exp3_Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        // StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // convert to uppercase
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }

        System.out.println("Uppercase string: " + sb.toString());

        sc.close(); // close scanner
    }
}

// By inbuilt function
// import java.util.Scanner;

// public class ToUpperCaseInbuilt {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = sc.nextLine();

//         StringBuffer sb = new StringBuffer(input.toUpperCase());

//         System.out.println("Uppercase string: " + sb.toString());
//     }
// }