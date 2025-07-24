import java.awt.*;
import java.awt.event.*;

class ActionDemo_Button extends Frame implements ActionListener {
	Button b1, b2;
	boolean c = false;
	boolean d = false;
    ActionDemo_Button() {  
	   setSize(600,500);
	   setVisible(true);
	   setLayout(new FlowLayout());
	   b1=new Button("Click1");
	   add(b1);
	   b2=new Button("Click2");
	   add(b2);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			c = true;
		}
		if (e.getSource() == b2) {
			d= true;
		}
		repaint();
	}
	
	public void paint(Graphics g) {
	    if(c)
		{
			g.drawRect(50,50,100,100); 
			c=false;
		}
		if(d) 
		{
			g.drawOval(50, 50, 100, 100);
			d = false;
		}
	}  
	public static void main(String args[])
	{
		ActionDemo_Button d1 = new ActionDemo_Button();
	}


}