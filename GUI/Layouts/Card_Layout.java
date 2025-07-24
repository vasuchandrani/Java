import java.awt.*;
public class Card_Layout extends Frame
{
    Card_Layout()
    {
        super("Card Layout");
        setSize(600, 600);
        setVisible(true);
        CardLayout c1 = new CardLayout();
        setLayout(c1);
        Panel p1= new Panel();
        Panel p2= new Panel();
        //Button b1 = new Button("Submit");
        p1.add(new Button("Submit"));
        //Button b2 = new Button("Reset");
        p1.add(new Button("Cencel"));
        //Button b3 = new Button("Show");
        p2.add(new Button("Show"));
        //Button b4 = new Button("Close");
        p2.add(new Button("Close"));
        add(p1,"Card 1");
        add(p2,"Card 2");
        c1.show(this,"Card 2");
    }
    public static void main(String args[])
    {
        Card_Layout cl1 = new Card_Layout();
    }
}
