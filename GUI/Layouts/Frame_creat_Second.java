import java.awt.*;
public class Frame_creat_Second extends Frame
{
    Frame_creat_Second()
    {
        super("Second Way Frame");
        setSize(400, 200);
        setVisible(true);
        setBackground(Color.RED);
    }
    public static void main(String args[])
    {
         new Frame_creat_Second();
    }
}
