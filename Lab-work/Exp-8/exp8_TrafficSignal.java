import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class exp8_TrafficSignal extends Frame implements ItemListener{
    
    CheckboxGroup cbg;
    Checkbox c1,c2,c3; 
    
    exp8_TrafficSignal() {
        setTitle("Trafic Signal");
        setVisible(true);
        setSize(500,500);

        setLayout(null);
        cbg = new CheckboxGroup();
        c1 = new Checkbox("RED",cbg,false);
        c2 = new Checkbox("ORANGE",cbg,false);
        c3 = new Checkbox("GREEN",cbg,false);

        c1.setBounds(300,100,100,100);
        add(c1);
        c2.setBounds(300,210,100,100);
        add(c2);        
        c3.setBounds(300,320,100,100);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }
    
    public void paint(Graphics g) {
        
        g.drawRect(100, 100, 100, 320);
        g.setColor(Color.RED);
        g.drawOval(100, 100, 100, 100);
        g.setColor(Color.ORANGE);
        g.drawOval(100, 210, 100, 100);
        g.setColor(Color.GREEN);
        g.drawOval(100, 320, 100, 100);

        if(c1.getState()){
            g.setColor(Color.RED);
            g.fillOval(100, 100, 100, 100);
        }
        else if(c2.getState()){
            g.setColor(Color.ORANGE);
            g.fillOval(100, 210, 100, 100);
        }
        else if(c3.getState()){
            g.setColor(Color.GREEN);
            g.fillOval(100, 320, 100, 100);
        }
    }

    public static void main(String[] args) {
        new exp8_TrafficSignal();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // throw new UnsupportedOperationException("Not supported yet.");
        repaint();
    }
}
