import java.awt.*;
public class Find extends Frame
{
    TextField t1;
    Label l1;
    Button b1,b2;
    Panel p1;
    Find()
    {
        super("Find");
        setSize(400,200);
        setVisible(true);
        setLayout(new FlowLayout());

        l1 = new Label("Find");
        t1 = new TextField(20);
        b1 = new Button("Find");
        b2 = new Button("Cencel");
        p1 = new Panel();
        p1.setLayout(new GridLayout(2,1));
        p1.add(b1);
        p1.add(b2);
        
        add(l1);
        add(t1);
        add(p1);
    }
    public static void main(String[] args) 
    {
        Find f1 = new Find();   
    }
}
