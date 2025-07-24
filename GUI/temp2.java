class first extends Thread {
    @Override
    public void run () {
        for (int i=0; i<5; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
class second extends Thread {
    @Override
    public void run () {
        for (int i=5; i<10; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
public class temp2 {
    public static void main(String[] args) {
        
        first f = new first();
        second s = new second();

        f.setPriority(10);
        s.setPriority(1);

        f.start();
        s.start();
    }
}
