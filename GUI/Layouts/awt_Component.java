import java.awt.*;
public class awt_Component extends Frame
{
    awt_Component()
    {
        super("Awt Components");
        setSize(600, 600);
        setVisible(true);
        setLayout( new GridLayout(6,2));
        Label l1 = new Label("Name");
        add(l1);
        TextField t1 = new TextField();
        add(t1);
        Label l2 = new Label("E-mail");
        add(l2);
        TextField t2 = new TextField();
        add(t2);
        Label l3 = new Label("Gender");
        add(l3);
        Panel p1 = new Panel();
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cbg, false);
        Checkbox c2 = new Checkbox("Female", cbg, false);
        p1.add(c1);
        p1.add(c2);
        add(p1);
        Label l4 = new Label("Address");
        add(l4);
        TextArea ta1 = new TextArea("Enter your Address here.");
        add(ta1);
        Label l5 = new Label("Hobbies");
        add(l5);
        Panel p2 = new Panel();
        Checkbox ch1 = new Checkbox("Reading");
        Checkbox ch2 = new Checkbox("Traveling");
        Checkbox ch3 = new Checkbox("Writing");
        p2.add(ch1);
        p2.add(ch2);
        p2.add(ch3);
        add(p2);
        Label l6 = new Label("City");
        
       

    }
    public static void main(String args[])
    {
        awt_Component ac1 = new awt_Component();
    }
}
