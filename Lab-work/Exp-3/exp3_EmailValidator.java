/*
Rule of valid email: 
    -> (.)dot is not allowed before @(atthrate)
    -> Only one (.)dot and one @ is allowed
    -> Not start name from any digit
*/
import java.util.Scanner;

public class exp3_EmailValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid email-address");
        String email = sc.nextLine();

        int n = email.length();
        String id = "";
        String server = ""; 

        boolean atthrate = false;
        boolean dot = false;
        
        if (email.charAt(0) >= '0' && email.charAt(0) <= '9') {
            System.out.println("Invalid email");
            System.exit(0);
        }

        for (int i=0; i<n; i++) {

            if (email.charAt(i) == '@') {
                if (!atthrate) {
                    atthrate = true;
                } else {
                    System.out.println("Invalid email");
                    System.exit(0);
                }   
            }

            if (email.charAt(i) == '.') {
                if (!dot && atthrate) {
                    dot = true;
                } else {
                    System.out.println("Invalid email");
                    System.exit(0);
                }
            } 

            if (email.charAt(i) >= 'a' && email.charAt(i) <= 'z' || email.charAt(i) == '.') {
                if (!atthrate) {
                    id += email.charAt(i);
                }
                else if (atthrate) {
                    server += email.charAt(i);
                }
            }
        }

        System.out.println("Valid email");
        System.out.println("Email id: "+id);
        System.out.println("Email server address: "+server);
    }
}
