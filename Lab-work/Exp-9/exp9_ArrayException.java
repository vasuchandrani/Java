import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
 
public class exp9_ArrayException extends Frame implements ActionListener{
    
    int[] arr = new int[100];
    TextField t1, t2;
    Label l1, l2;
    Button b1;
 
    exp9_ArrayException() {
        Random r = new Random();
        for (int i=0; i<100; i++) {
            arr[i] = r.nextInt(5);
            // arr[i] = i;
        }
        setSize(500,500);
        setLayout(null);
        setTitle("Get Index");
        setVisible(true);
    
        t1 = new TextField(7);
        t2 = new TextField(7);
        l1 = new Label("INDEX");
        l2 = new Label("VALUE");
        b1 = new Button("GET");
 
        Panel p1 = new Panel();
        p1.add(l1);
        p1.add(t1);
        p1.setBounds(0, 50, 500, 50);
        add(p1);
 
        Panel p2 = new Panel();
        p2.add(l2);
        p2.add(t2);
        p2.setBounds(0, 100, 500, 50);
        add(p2);
        
        b1.setBounds(200,160,100,30);
        add(b1);
        b1.addActionListener(this);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t1.getText());
        if (e.getSource() == b1) {
 
            String s = t1.getText();
            if (s.length() == 0) {
                
            }else {
                try {
                    t2.setText(Integer.toString(arr[num]));
                }catch (Exception ex) {
                    t2.setText("Wrong_Arry_idx");
                }
            }
        }
    }
    public static void main(String[] args) {
        new exp9_ArrayException();
    }
}