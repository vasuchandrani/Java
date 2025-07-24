import java.awt.*;
public class Set_Bounds extends Frame
{
    Set_Bounds()
    {
        super("SET BOUNDS");
        setSize(600, 600);
        setVisible(true);
        setLayout(null);
        Button b1 = new Button("Submit");
        add(b1);
        b1.setBounds(350, 250, 100, 100);
    }
    public static void main(String args[])
    {
        Set_Bounds sb= new Set_Bounds();
    }
}
