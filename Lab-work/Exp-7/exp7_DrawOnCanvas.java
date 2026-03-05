import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class exp7_DrawOnCanvas extends Frame implements ItemListener{
    CheckboxGroup cbg;
    Checkbox c1,c2;
    exp7_DrawOnCanvas(){
        setSize(500,500);
        setVisible(true);
        setTitle("Title");

        setLayout(new FlowLayout());
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Circle",cbg,false);
        c2 = new Checkbox("Rectangle",cbg,false);
        
        add(c1,cbg);
        add(c2,cbg);
        // c1.addItemListener(e->repaint());
        // c2.addItemListener(e->repaint());
        repaint();
        c1.addItemListener(this);
        c2.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        repaint();
    }
    public void paint(Graphics g){
        if(c1.getState()){
            g.drawOval(100, 100, 300, 300);
        }
        else if(c2.getState()){
            g.drawRect(100, 100, 300, 300);
        }
    }
    public static void main(String[] args) {
        new exp7_DrawOnCanvas();
    }
}