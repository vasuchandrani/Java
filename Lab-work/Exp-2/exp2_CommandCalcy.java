import static java.lang.System.out;

public class exp2_CommandCalcy {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        String s = args[1];
        int b = Integer.parseInt(args[2]);

        switch (s) {
            case "+" -> out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "x" -> System.out.println(a * b);
            case "/" -> System.out.println((float)a/b);
            default -> {}
        }
    }  
}


// public class exp2_cmdCalcy {
//     public static void main(String[] args) {
        
//         int a = Integer.parseInt(args[0]);
//         String s = args[1];
//         int b = Integer.parseInt(args[2]);

//         if (s.equals("+")) {
//             System.out.println(a + b);
//         }
//         else if (s.equals("-")) {
//             System.out.println(a - b);
//         }
//         else if (s.equals("*")) {
//             System.out.println(a * b);
//         }
//         else if (s.equals("/")) {
//             System.out.println((float)a/b);
//         }
//     }   
// }