import java.awt.*;
import java.awt.event.*;
class Mouse_Position extends Frame implements MouseListener
{
    Mouse_Position()
    {
        super("Mouse Position");
        setSize(400,600);
        setVisible(true);
        addMouseListener(this);
    }
    public void mouseClicked (MouseEvent e)
    {
        System.out.println(e.getX()+"  "+e.getY());
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public static void main(String args[])
    {
        Mouse_Position mp1= new Mouse_Position();
    }
}
