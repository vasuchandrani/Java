import java.awt.*;
import java.awt.event.*;
public class Result extends Frame implements ActionListener
{
    Label l0,l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2,t3,t4,t5,t6,t7,t8;
    Button b1;
    Panel p1;
    Result()
    {
        super("RESULT");
        setSize(500,500);
        setVisible(true);
        setLayout(new GridBagLayout());
        setBackground(Color.YELLOW);
        l0 = new Label("ENTER YOUR MARKS HERE.");
        l1 = new Label("OOPJ");
        l2 = new Label("DDC");
        l3 = new Label("PTS");
        l4 = new Label("DSA");
        l5 = new Label("CS");
        l6 = new Label("Total");
        l7 = new Label("Percentage");
        l8 = new Label("Grade");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);
        t5 = new TextField(20);
        t6 = new TextField(8);t6.setEditable(false);
        t7 = new TextField(8);t7.setEditable(false);
        t8 = new TextField(8);t8.setEditable(false);

        b1 = new Button("Calculate");b1.addActionListener(this);
        

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        gbc.insets=new Insets(10,0,0,0);
        
        gbc.gridx=0; gbc.gridy=1;add(l1,gbc);
        gbc.gridx=0; gbc.gridy=2;add(l2,gbc);
        gbc.gridx=0; gbc.gridy=3;add(l3,gbc);
        gbc.gridx=0; gbc.gridy=4;add(l4,gbc);
        gbc.gridx=0; gbc.gridy=5;add(l5,gbc);


        gbc.gridx=1; gbc.gridy=1;gbc.gridwidth=2;add(t1,gbc);
        gbc.gridx=1; gbc.gridy=2;gbc.gridwidth=2;add(t2,gbc);
        gbc.gridx=1; gbc.gridy=3;gbc.gridwidth=2;add(t3,gbc);
        gbc.gridx=1; gbc.gridy=4;gbc.gridwidth=2;add(t4,gbc);
        gbc.gridx=1; gbc.gridy=5;gbc.gridwidth=2;add(t5,gbc);  
        
        gbc.gridx=0;gbc.gridy=6;add(l6,gbc);
        gbc.gridx=0;gbc.gridy=7;add(t6,gbc);

        gbc.gridx=1;gbc.gridy=6;add(l7,gbc);
        gbc.gridx=1;gbc.gridy=7;add(t7,gbc);

        gbc.gridx=2;gbc.gridy=6;add(l8,gbc);
        gbc.gridx=2;gbc.gridy=7;add(t8,gbc);

        gbc.gridx=0;gbc.gridy=9; gbc.gridwidth=3;add(b1,gbc);
        gbc.gridx=0; gbc.gridy=0; gbc.gridwidth=3;add(l0,gbc);
    }
    public void actionPerformed(ActionEvent e)
    {
        float i1 = Float.parseFloat(t1.getText());
        float i2 = Float.parseFloat(t2.getText());
        float i3 = Float.parseFloat(t3.getText());
        float i4 = Float.parseFloat(t4.getText());
        float i5 = Float.parseFloat(t5.getText());
        float avg = i1+i2+i3+i4+i5;
        float per = avg/5;
        t6.setText(Float.toString(avg));
        t7.setText(Float.toString(per));
        if(per>=95.00)
        {
            t8.setText("AA");
        }
        else if(per>=75.00 && per<95.00)
        {
            t8.setText("BB");
        }
        else if(per>=55.00 && per<75.00)
        {
            t8.setText("CC");
        }
        else if(per>=0.00 && per<55.00)        
        {
            t8.setText("FAIL");
        }
    }
    public static void main(String[] args) 
    {
        Result r1 = new Result();
    }
}
