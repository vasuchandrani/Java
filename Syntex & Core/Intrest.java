import java.awt.*;
import java.awt.event.*;
class Intrest extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1;
    Intrest()
    {
        super("Simple Intrest");
        setSize(400,400);
        setVisible(true);
        setLayout(new GridBagLayout());
        setBackground(Color.YELLOW);
        l1 = new Label("Priciple");
        l2 = new Label("Rate %");
        l3 = new Label("Time (Years)");
        l4 = new Label("Simple Intrest");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);t4.setEditable(false);

        b1 = new Button("Show"); b1.addActionListener(this);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0; gbc.gridy=0;add(l1,gbc);
        gbc.gridx=0; gbc.gridy=1;add(l2,gbc);
        gbc.gridx=0; gbc.gridy=2;add(l3,gbc);
        gbc.gridx=0; gbc.gridy=3;add(l4,gbc);

        gbc.gridx=1; gbc.gridy=0;add(t1,gbc);
        gbc.gridx=1; gbc.gridy=1;add(t2,gbc);
        gbc.gridx=1; gbc.gridy=2;add(t3,gbc);
        gbc.gridx=1; gbc.gridy=3;add(t4,gbc);

        gbc.gridx=0;gbc.gridy=4; gbc.gridwidth=4;add(b1,gbc);
    }
    public void actionPerformed (ActionEvent e)
    {
       int p = Integer.parseInt(t1.getText());
       int r = Integer.parseInt(t2.getText());
       int n = Integer.parseInt(t3.getText());
       int i = (p*r*n)/100;
       t4.setText(Integer.toString(i));
    }
    public static void main(String[] args) 
    {
        Intrest i1 = new Intrest();
    }
}