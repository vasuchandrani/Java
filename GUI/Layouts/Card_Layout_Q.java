import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Card_Layout_Q //implements ActiveEvent
{
    public static void main(String args[])
    {
    Frame f1 = new Frame("Card Layout Demo");
    f1.setSize(600,600);
    f1.setVisible(true);
    CardLayout cl1 = new CardLayout();
    f1.setLayout(cl1);
    Panel p1 = new Panel();
    Button b1 = new Button("Button 1 - Card 1");//b1.addActionListener(f1);
    p1.add(b1);
    Button b2 = new Button("Button 2 - Card 2");
    p1.add(b2);
    Button b3 = new Button("First");
    p1.add(b3);
    Button b4 = new Button("Next");
    p1.add(b4);
    Button b5 = new Button("Previous");
    p1.add(b5);
    Button b6 = new Button("Last");
    p1.add(b6);
    p1.setBackground(Color.RED);
    f1.add(p1);
    
    Panel p2 = new Panel();
    TextField t1 = new TextField("TextFeild on Card 2");
    p2.add(t1);
    p2.setBackground(Color.GREEN);
    p2.add(b3);
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    f1.add(p2);

    Panel p3 = new Panel();
    Label l1 = new Label("Card 3");
    p3.setLayout(new FlowLayout());
    p3.add(l1);
    p3.setBackground(Color.BLUE);
    p3.add(b3);
    p3.add(b4);
    p3.add(b5);
    p3.add(b6);
    f1.add(p1,"c1");
    f1.add(p2,"c2");
    f1.add(p3,"c3");

    cl1.show(f1,"c1");

    
    }
    /*public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            cl1.First(f1);
        }
    }*/
}
