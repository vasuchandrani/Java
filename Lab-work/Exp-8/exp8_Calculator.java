import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp8_Calculator extends Frame implements ActionListener{

    TextField tf;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button plus, minus, divide, multiply, clear, delete, equal;
    
    private Character operator = null;
        exp8_Calculator() {

            GridBagLayout gbl = new GridBagLayout();
            GridBagConstraints gbc = new GridBagConstraints();
            
            setLayout(gbl);
            setVisible(true);
            setSize(500,500);
            
            tf = new TextField();

            b0 = new Button("0");
            b1 = new Button("1");
            b2 = new Button("2");
            b3 = new Button("3");
            b4 = new Button("4");
            b5 = new Button("5");
            b6 = new Button("6");
            b7 = new Button("7");
            b8 = new Button("8");
            b9 = new Button("9");
            
            plus = new Button("+");
            minus = new Button("-");
            divide = new Button("/");
            multiply = new Button("*");
            equal = new Button("=");
            clear = new Button("AC");
            delete = new Button("DEL");


            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.insets = new Insets(0,0,10,0);
            gbc.gridwidth = 4;     
            gbc.gridx = 0;
            gbc.gridy = 0;
            this.add(tf,gbc);

            gbc.gridwidth = 1;
            gbc.insets = new Insets(3,3,3,3);

            gbc.gridx = 0;
            gbc.gridy = 2;
            this.add(b1,gbc);
            gbc.gridx = 1;
            gbc.gridy = 2;
            this.add(b2,gbc);
            gbc.gridx = 2;
            gbc.gridy = 2;
            this.add(b3,gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            this.add(b4,gbc);
            gbc.gridx = 1;
            gbc.gridy = 3;
            this.add(b5,gbc);
            gbc.gridx = 2;
            gbc.gridy = 3;
            this.add(b6,gbc);

            gbc.gridx = 0;
            gbc.gridy = 4;
            this.add(b7,gbc);
            gbc.gridx = 1;
            gbc.gridy = 4;
            this.add(b8,gbc);
            gbc.gridx = 2;
            gbc.gridy = 4;
            this.add(b9,gbc);

            gbc.gridwidth = 2;
            gbc.gridx = 0;
            gbc.gridy = 5;
            this.add(b0,gbc);

            
            // Add plus, minus, divide, multiply, delete, clear, equal button.  
            gbc.gridwidth = 2;
            gbc.gridx = 0;
            gbc.gridy = 1;
            this.add(delete,gbc);  
            gbc.gridx = 2;
            gbc.gridy = 1;
            this.add(clear,gbc);

            gbc.gridwidth = 1;
            gbc.gridx = 2;
            gbc.gridy = 5;
            this.add(equal,gbc);

            gbc.gridx = 3;
            gbc.gridy = 2;
            this.add(plus,gbc);

            gbc.gridx = 3;
            gbc.gridy = 3;
            this.add(minus,gbc);            
            
            gbc.gridx = 3;
            gbc.gridy = 4;
            this.add(multiply,gbc);            
            
            gbc.gridx = 3;
            gbc.gridy = 5;
            this.add(divide,gbc);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            plus.addActionListener(this);
            minus.addActionListener(this);
            multiply.addActionListener(this);
            divide.addActionListener(this);
            tf.addActionListener(this);
            equal.addActionListener(this);
            clear.addActionListener(this);
            delete.addActionListener(this);
        }

    public static void main(String[] args) {
        new exp8_Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            tf.setText(tf.getText() + b1.getLabel());
        }
        else if (e.getSource() == b2) {
            tf.setText(tf.getText() + b2.getLabel());
        }
        else if (e.getSource() == b3) {
            tf.setText(tf.getText() + b3.getLabel());
        }
        else if (e.getSource() == b4) {
            tf.setText(tf.getText() + b4.getLabel());
        }
        else if (e.getSource() == b5) {
            tf.setText(tf.getText() + b5.getLabel());
        }
        else if (e.getSource() == b6) {
            tf.setText(tf.getText() + b6.getLabel());
        }
        else if (e.getSource() == b7) {
            tf.setText(tf.getText() + b7.getLabel());
        }
        else if (e.getSource() == b8) {
            tf.setText(tf.getText() + b8.getLabel());
        }
        else if (e.getSource() == b9) {
            tf.setText(tf.getText() + b9.getLabel());
        }
        else if (e.getSource() == b0) {
            tf.setText(tf.getText() + b0.getLabel());
        }
        else if (e.getSource() == plus) {
            tf.setText(tf.getText() + plus.getLabel());
            operator = '+';
        }
        else if (e.getSource() == minus) {
            tf.setText(tf.getText() + minus.getLabel());
            operator = '-';
        }
        else if (e.getSource() == multiply) {
            tf.setText(tf.getText() + multiply.getLabel());
            operator = '*';
        }
        else if (e.getSource() == divide) {
            tf.setText(tf.getText() + divide.getLabel());
            operator = '/';
        }
        else if (e.getSource() == clear) {
            tf.setText(null);
        }
        else if (e.getSource() == delete) {
            String s = tf.getText();
            if (s.length() == 0) {
                
            }else{
                s = s.substring(0, s.length()-1);
                tf.setText(s);    
            }
        }
        else if (e.getSource() == equal) {

            String S = tf.getText();
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();

            int idx = 0;
            for (int i=0; i<S.length(); i++) {
                if (S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '*' || S.charAt(i) == '/') {
                    idx = i;
                    break;
                }
                else {
                    s1.append(S.charAt(i));
                }
            }

            for (int i = idx+1; i<S.length(); i++) {
                s2.append(S.charAt(i));
            }
            String str1 = s1.toString();
            String str2 = s2.toString();

            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);

            int result = 0;
            int zero = 0;
            switch(operator) {
                case '+' -> result = a + b;
                case '-' -> result = a - b;
                case '*' -> result = a * b;
                case '/' -> {
                    if (b != 0) {
                        result = a / b;
                    } else {
                        zero = 1;
                    }
                }
                default -> tf.setText(null);
            }
            if (zero == 1) {
                tf.setText("Can't divide by 0");
            } else {
                String finalAns = Integer.toString(result);
                tf.setText(finalAns);
            }
        }
    }
}