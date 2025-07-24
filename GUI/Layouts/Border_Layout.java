import java.awt.*;
public class Border_Layout extends Frame
{
    Border_Layout()
    {
        super("Border Layout");
        setSize(600, 600);
        setVisible(true);
        setLayout( new BorderLayout(50,50));
        Button b1 = new Button("NORTH");
        add(b1,BorderLayout.NORTH);
        Button b2 = new Button("SOUTH");
        add(b2,BorderLayout.SOUTH);
        Button b3 = new Button("EAST");
        add(b3,BorderLayout.EAST);
        Button b4 = new Button("WEST");
        add(b4,BorderLayout.WEST);
        Button b5 = new Button("CENTER");
        add(b5,BorderLayout.CENTER);
    }
    public static void main(String args[])
    {
        Border_Layout bl1 = new Border_Layout();
    }
    
}
