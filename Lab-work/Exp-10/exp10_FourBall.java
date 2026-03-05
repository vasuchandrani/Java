import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class exp10_FourBall extends Frame implements Runnable {

    int xy[][];
    int xySpeed[][];

    exp10_FourBall() {

        setSize(500, 500);
        setTitle("Four Ball Animation");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);

        // positions
        xy = new int[4][2];
        xy[0][0] = 100; xy[0][1] = 25;
        xy[1][0] = 250; xy[1][1] = 25;
        xy[2][0] = 25;  xy[2][1] = 300;
        xy[3][0] = 200; xy[3][1] = 400;

        // directions
        xySpeed = new int[4][2];
        xySpeed[0][0] = -2; xySpeed[0][1] = 2;
        xySpeed[1][0] = 2;  xySpeed[1][1] = 2;
        xySpeed[2][0] = 2;  xySpeed[2][1] = -2;
        xySpeed[3][0] = -2; xySpeed[3][1] = -2;
    }

    public void run() {

        while (true) {

            for (int i = 0; i < 4; i++) {

                // X boundary check
                if (xy[i][0] >= 480 || xy[i][0] <= 0) {
                    xySpeed[i][0] = -xySpeed[i][0];
                }

                // Y boundary check
                if (xy[i][1] >= 480 || xy[i][1] <= 0) {
                    xySpeed[i][1] = -xySpeed[i][1];
                }

                // move ball
                xy[i][0] += xySpeed[i][0];
                xy[i][1] += xySpeed[i][1];
            }

            repaint();

            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g) {

        for (int i = 0; i < 4; i++) {
            g.fillOval(xy[i][0], xy[i][1], 20, 20);
        }
    }

    public static void main(String[] args) {

        exp10_FourBall balls = new exp10_FourBall();
        Thread t = new Thread(balls);
        t.start();
    }
}