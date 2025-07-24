import java.awt.*;
import java.awt.event.*;
public class Cycle extends Frame implements ActionListener
{
    int count=0;
    Button b1;
    Cycle()
    {
        super("COLOR CYCLE");
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        b1= new Button("Change");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e)
    {
        if(count==0)
        {
            setBackground(Color.RED);
            count++;
        }
        else if(count==1)
        {
            setBackground(Color.GREEN);
            count++;
        }
        else if(count==2)
        {
            setBackground(Color.BLUE);
            count=0;
        }
    }
    public static void main(String[] args) 
    {
        Cycle c1 = new Cycle();
    }
}
