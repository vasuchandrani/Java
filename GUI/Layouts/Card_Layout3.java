import java.awt.*;
import java.awt.event.*;
class Card_Layout3 extends Frame implements ActionListener
{
    Panel p1,p2,p3,p4,cards;
    CardLayout c;
    Button b1,b2;
    TextField tf;
    Label la;
    Button f,n,p,l;
    Card_Layout3()
    {
        setSize(500,500);
        setVisible(true);
        setTitle("example");
        c=new CardLayout();

        p1=new Panel();p1.setBackground(Color.RED);
        p2=new Panel();p2.setBackground(Color.GREEN);
        p3=new Panel();p3.setBackground(Color.BLUE);
        p4=new Panel();
        cards=new Panel();
        cards.setLayout(c);

        b1=new Button("1-c1");p1.add(b1);
        b2=new Button("2-c1");p1.add(b2);
        tf=new TextField("tf-c2");p2.add(tf);
        la=new Label("c3");p3.add(la);

        add(cards,BorderLayout.CENTER);
        cards.add(p1,"c1");
        cards.add(p2,"c2");
        cards.add(p3,"c3");
        c.show(cards,"c1");
    
        f=new Button("first");f.addActionListener(this);
        n=new Button("next");n.addActionListener(this);
        p=new Button("previous");p.addActionListener(this);
        l=new Button("last");l.addActionListener(this);
        p4.add(f);p4.add(n);p4.add(p);p4.add(l);
        add(p4,BorderLayout.SOUTH);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==f)
        {
            c.first(cards);
        }
        else if(e.getSource()==l)
        {
            c.last(cards);
        }
        else if(e.getSource()==p)
        {
            c.previous(cards);
        }
        else if(e.getSource()==n)
        {
            c.next(cards);   
        }
    }
    public static void main(String args[])
    {
        Card_Layout3 obj=new Card_Layout3();
    }
}