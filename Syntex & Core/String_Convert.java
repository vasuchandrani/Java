import java.awt.*;
import java.awt.event.*;
class String_Convert extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1;
    String_Convert()
    {
        super("String Convert aand Count");
        setSize(600,600);
        setVisible(true);
        setLayout(new GridBagLayout());
        setBackground(Color.YELLOW);
        l1 = new Label("Input");
        l2 = new Label("Length");
        l3 = new Label("Lower Case");
        l4 = new Label("Upper Case");

        t1 = new TextField(20);
        t2 = new TextField(20);t2.setEditable(false);
        t3 = new TextField(20);t3.setEditable(false);
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
    public void actionPerformed(ActionEvent e)
    {
        String str;
        str=t1.getText();
        t2.setText(Integer.toString(str.length()));
        t3.setText(str.toLowerCase());
        t4.setText(str.toUpperCase());
    }
    public static void main(String[] args) 
    {
        String_Convert sc1 = new String_Convert();
    }
}