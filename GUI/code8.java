// Card Layout

import java.awt.*;

class code8 extends Frame {
    
    code8() {
        super("CardLayout Demo");
        setSize(500,500);
        setVisible(true);
        CardLayout c1 = new CardLayout();
        setLayout(c1);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        p1.add(new Button("Submit"));
        p1.add(new Button("Cancel"));
        
        p2.add(new Label("Show"));
        p2.add(new Label("Cancel"));
        
        add(p1,"Page1");
        add(p2,"Page2");
        
        c1.show(this,"Page1"); // this will not show.
        c1.show(this,"Page2");
    }
    public static void main(String args[]){
        code8 f = new code8();
    }
}