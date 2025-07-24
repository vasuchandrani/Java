import java.awt.Frame;
import java.awt.Graphics;

public class temp3 extends Frame implements Runnable {

    int x = 0;
    int dir = 1;

    temp3() {
        setSize(500, 500);
        setTitle("circle");
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        if (x > 480) {
            dir = -1;
        } else if (x < 20) {
            dir = 1;
        }

        if (dir == 1) {
            x += 20;
        } else {
            x -= 20;
        }
        g.drawOval(x, 250, 20, 20); 
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        temp3 tm = new temp3();
        Thread t = new Thread(tm);
        t.start();
    }
}
