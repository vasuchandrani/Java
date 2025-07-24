import java.awt.*;

public class temp6 extends Frame {
    List l;
    temp6() {

        setSize(700,400);
        setVisible(true);
        setLayout(new FlowLayout());

        l= new List();
        l.add("List1");
        l.add("List2");
        l.add("List3");

        add(l);
    }

    public static void main(String[] args) {
        temp6 t = new temp6();
    }
}

