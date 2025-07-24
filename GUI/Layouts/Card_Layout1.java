import java.awt.*;
import java.awt.event.*;
public class Card_Layout1 extends Frame implements ActionListener
{
    CardLayout c;
    Button b1,b2,b3,b4;
    Card_Layout1()
    {
        super("Card Layout");
        setSize(600, 600);
        setVisible(true);
        c= new CardLayout();
        setLayout(c);
        Panel p1= new Panel();
        Panel p2= new Panel();
        b1 = new Button("Next");b1.addActionListener(this);
        p1.add(b1);
        /*Button b2 = new Button("Reset");
        p1.add(b2);*/
        b3 = new Button("Prev");b3.addActionListener(this);
        p2.add(b3);
        b4 = new Button("Close");b4.addActionListener(this);
        p2.add(b4);
        add(p1,"c1");
        add(p2,"c2");
        c.show(this,"c1");
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            c.next(this);
        }
        else if(e.getSource()==b3)
        {
            c.previous(this);
        }
        else if(e.getSource()==b4)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        Card_Layout cl1 = new Card_Layout();
    }
}