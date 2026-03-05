import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp7_Calculator extends Frame implements ActionListener {
    TextField t1, t2, ans;
    Button b1, b2, b3, b4;
    Label l;
    exp7_Calculator() {
        super("Calculator");    
        setSize(500,500);
        setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

        t1 = new TextField();
        t2 = new TextField();
        l = new Label("Answer :");
        ans = new TextField();
        t1.setBounds(100,100,100,30);
        t2.setBounds(210,100,100,30);
        l.setBounds(120,140,80,30);
        ans.setBounds(210,140,100,30);

        add(t1);
        add(t2);
        add(l);
        add(ans);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        
        b1.setBounds(100,200,30,30);
        b2.setBounds(160,200,30,30);
        b3.setBounds(220,200,30,30);
        b4.setBounds(280,200,30,30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean f = true;
        int a = 0;
        int b = 0;
        try {    
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
        } catch (NumberFormatException e1) {
            f = false;
            ans.setText("Invalid Input");
        }

        if (f) {
            if (e.getSource() == b1) {
                ans.setText(Integer.toString(a+b));
            }
            else if (e.getSource() == b2) {
                ans.setText(Integer.toString(a-b));
            }
            else if (e.getSource() == b3) {
                ans.setText(Integer.toString(a*b));
            }
            else if (e.getSource() == b4) {
                if (b != 0)
                    ans.setText(Integer.toString(a/b));
                else {
                    ans.setText("error");
                }
            }
        }
    }

    // public void paint (Graphics g) {

    // }
    public static void main(String[] args) {
        exp7_Calculator c = new exp7_Calculator();
    }
}