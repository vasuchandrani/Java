import java.awt.*;
import java.awt.event.*;

class MouseDemo2 extends Frame implements MouseListener
{
    Label l1,l2;
    TextField t1,t2;
    MouseDemo2()
    {
        super("Upper to Lower");
        setSize(400, 400);
        setVisible(true);
        setLayout(new GridBagLayout());
        setBackground(Color.YELLOW);
        l1= new Label("Input");
        l2= new Label("Output");
        t1= new TextField(20);
        t2 = new TextField(20);
        t2.setEnabled(false);
        addMouseListener(this); 

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;gbc.gridy=0;add(l1,gbc);
        gbc.gridx=0;gbc.gridy=1;add(l2,gbc);
        gbc.gridx=1;gbc.gridy=0;add(t1,gbc);
        gbc.gridx=1;gbc.gridy=1;add(t2,gbc);
    
    
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e)
    {
        t2.setText(t1.getText().toUpperCase());
    }
    public void mouseReleased(MouseEvent e)
    {
        t2.setText(t1.getText().toLowerCase());
    }
    public static void main(String args[])
    {
        MouseDemo2 md2 = new MouseDemo2();
    }
}