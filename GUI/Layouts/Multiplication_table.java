import java.awt.*;
import java.awt.Graphics.*;
public class Multiplication_table extends Frame
{
    Multiplication_table()
    {
        super("Multiplication Table");
        setSize(600,600);
        setVisible(true);
    }
    void Paint (Graphics g)
    {
        for(int i=0;i<11;i++)
        {
            g.drawString(String.valueOf(i), 25,(50*(i+1)));
        }
        for(int i=0;i<11;i++)
        {
            g.drawString(String.valueOf(i), (50*(i+1)),50);
        }
        for(int i=1;i<11;i++)
        {
            for(int j=1;j<11;j++)
            {
                g.drawString(String.valueOf(i), (50*(i+1)),(50*(j+1)));
            }
        }
    }
    public static void main(String args[])
    {
        Multiplication_table mt1 = new Multiplication_table();
    }
}
