import java.awt.*;
public class exp6_MultiplicationTable extends Frame {
    exp6_MultiplicationTable() {
        setSize(500,500);
        setVisible(true);
        setTitle("Multiplication Table");
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(100, 100, 80, 210);
        int n = 10;
        for (int i = 1; i < n+1; i++) {
            g.drawString(n+" X "+i+" = "+(n*i), 100, 100+(20*i));
        }
    }
    public static void main(String[] args) {
        exp6_MultiplicationTable M = new exp6_MultiplicationTable();
    }
}