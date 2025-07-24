// Border Layout

import java.awt.*;

class code6 extends Frame {

    code6() {
        setSize(500,500);
        setVisible(true);
        setTitle("Border Layout");
        setLayout(new BorderLayout(10,10));

        // Label lnorth = new Label("NORTH");
        // add(lnorth, BorderLayout.NORTH);
        // Label lsouth = new Label("SOUTH");
        // add(lsouth, BorderLayout.SOUTH);
        // Label least = new Label("EAST");
        // add(least, BorderLayout.EAST);
        // Label lwest = new Label("WEST");
        // add(lwest, BorderLayout.WEST);
        // Label lcenter = new Label("CENTER");
        // add(lcenter, BorderLayout.CENTER);

        Button bnorth = new Button("NORTH");
        add(bnorth, BorderLayout.NORTH);
        Button bsouth = new Button("SOUTH");
        add(bsouth, BorderLayout.SOUTH);
        Button beast = new Button("EAST");
        add(beast, BorderLayout.EAST);
        Button bwest = new Button("WEST");
        add(bwest, BorderLayout.WEST);
        Button b1center = new Button("CENTER1");
        add(b1center, BorderLayout.CENTER); // This does not show, it overlap with button b2center.
        Button b2center = new Button("CENTER2");
        add(b2center, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        code6 f = new code6();
    }
}
