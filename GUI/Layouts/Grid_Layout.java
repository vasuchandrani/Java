import java.awt.*;
public class Grid_Layout extends Frame
{
    Grid_Layout()
    {
        super("Grid Layout");
        setSize(600, 600);
        setVisible(true);
        setLayout(new GridLayout(3,3));
        Button l1 = new Button("1");
        add(l1);
        Button l2 = new Button("2");
        add(l2);
        Button l3 = new Button("3");
        add(l3);
        Button l4 = new Button("4");
        add(l4);
        Button l5 = new Button("5");
        add(l5);
        Button l6 = new Button("6");
        add(l6);
        Button l7 = new Button("7");
        add(l7);
        Button l8 = new Button("8");
        add(l8);
        Button l9 = new Button("9");
        add(l9);
    }
    public static void main(String args[])
    {
        Grid_Layout g = new Grid_Layout();
    }
}
