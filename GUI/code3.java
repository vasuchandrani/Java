// methods 
import java.awt.*;  

class code3 extends Frame {

    code3() {
        super("Draw String");
        setSize(500,500);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello", 100, 100);
        // g.setColor(Color.RED);
        // g.fillRect(100, 102, 100, 100);
        // g.drawLine(300,150,300,250);
		// g.drawLine(250,200,350,200);
		// g.drawOval(250,150,100,100);

        // g.setColor(Color.RED);
        // g.drawRect(100, 100, 51, 51);
        g.setColor(Color.YELLOW);
        g.fillArc(100, 100, 50, 50, 90, 270);
    }
    public static void main(String args[]) {
        code3 f1 = new code3();
	}
}

