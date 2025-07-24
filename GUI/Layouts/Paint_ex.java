import java.awt.*;
import java.awt.Graphics.*;
public class Paint_ex extends Frame
{
    Paint_ex()
    {
        super("Paint Method Example");
        setSize(600, 400);
        setVisible(true);   
    }
    public void paint (Graphics g)
    {
        g.drawString("Example of Paint Method.",50,50);
		g.setColor(Color.RED);
		g.drawRect(250,150,100,100);
		g.setColor(Color.BLUE);
		g.drawOval(250,150,100,100);
		g.setColor(Color.BLACK);
		g.drawLine(300,150,300,250);
		g.drawLine(250,200,350,200);
		g.drawLine(250,200,350,200);
    }
    public static void main(String args[])
    {
        Paint_ex p = new Paint_ex();
    }
}
