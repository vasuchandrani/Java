import java.awt.*;
import java.awt.Frame.*;
public class Flow_Layout
{
    public static void main(String args[])
    {
        Frame f= new Frame("Flow Layout");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        Button b1 = new Button("left");
        f.add(b1);
        Button b2 = new Button("Center");
        f.add(b2);
        Button b3 = new Button("Right");
        f.add(b3);
    }
}
