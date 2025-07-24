import java.util.*;

class temp implements Runnable{
    String s;
    int n;

    temp (String s) {
        this.s = s;
    }

    @Override
    @SuppressWarnings("UseSpecificCatch")
    public void run() {
        try{
            for (int i=0; i < n; i++) {
                System.out.println(s.charAt(i));
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }
    }
    
    public static void main(String[] args) {
        // System.out.println("temp programiz.pro");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        temp h = new temp(s);
        h.n = s.length();

        Thread t = new Thread(h);
        t.start();
        
    }
}