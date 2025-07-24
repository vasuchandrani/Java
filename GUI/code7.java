// null layout, setBound(x,y,WIDTH,HEIGHT);

import java.awt.*;

class code7 extends Frame {

    Button b1, b2, b3, b4;
    code7() {
        setSize(500,500);
        setTitle("NULL Layout");
        setVisible(true);
        setLayout(null);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");

        b1.setBounds(100,200,30,30);
        b2.setBounds(160,200,30,30);
        b3.setBounds(220,200,30,30);
        // b4.setBounds(280,200,30,30);

        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    public static void main(String[] args) {
        code7 f = new code7();
    }
    
}
