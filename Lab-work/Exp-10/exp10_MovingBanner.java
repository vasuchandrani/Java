import java.awt.*;
import java.awt.event.*;

public class exp10_MovingBanner extends Frame implements ActionListener,Runnable{
    Choice c;
    Button b1;
    int diraction;
    int x1, y1, verticalSpeed, horizontalSpeed;
    Thread t;
    exp10_MovingBanner() {
        
        setSize(500,500);
        setTitle("Move it");
        setVisible(true);
        setLayout(new FlowLayout());
        c = new Choice();
        c.add("vertical");
        c.add("horizontal");
        add(c);

        b1 = new Button("click");
        add(b1);
        b1.addActionListener(this);

        x1 = 250;
        y1 = 250;
        verticalSpeed = 2;
        horizontalSpeed = 2;

        t = new Thread(this);
    }

    public void paint (Graphics g) {
        
        if (diraction == 1) {
            
            if (y1 > 440) {
                verticalSpeed = -2;
            }
            if (y1 < 20) {
                verticalSpeed = 2;
            }
            y1 += verticalSpeed;
        }
        else {

            if (x1 > 440) {
                horizontalSpeed = -2;
            }
            if (x1 < 20) {
                horizontalSpeed = 2;
            }
            x1 += horizontalSpeed;
        }    
        g.drawOval(x1, y1, 50, 50);
        
    }

    public void run () {
        while (true) { 
            repaint();
            try {
                Thread.sleep(5);    
            } catch (Exception e) {}
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (c.getSelectedItem().equals("vertical")){
            diraction = 1;
        }
        else if (c.getSelectedItem().equals("horizontal")) {
            diraction = 0;
        }

        if(e.getSource() == b1) {
            try {
                t.start();
            } catch (Exception ex) {}
        }
    }

    public static void main(String[] args) {
        exp10_MovingBanner s = new exp10_MovingBanner();
    }
}