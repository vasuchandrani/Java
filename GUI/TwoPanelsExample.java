import java.awt.*;
import java.awt.event.*;

public class TwoPanelsExample extends Frame {

    // Constructor to set up the frame
    TwoPanelsExample() {
        // Create first panel with null layout
        Panel panel1 = new Panel();
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(Color.LIGHT_GRAY);
        
        // Add a button to the first panel using null layout
        Button bnorth = new Button("NORTH");
        panel1.add(bnorth, BorderLayout.NORTH);
        Button bsouth = new Button("SOUTH");
        panel1.add(bsouth, BorderLayout.SOUTH);
        Button beast = new Button("EAST");
        panel1.add(beast, BorderLayout.EAST);
        Button bwest = new Button("WEST");
        panel1.add(bwest, BorderLayout.WEST);
        Button b1center = new Button("CENTER1");
        panel1.add(b1center, BorderLayout.CENTER);

        // Create second panel with FlowLayout
        Panel panel2 = new Panel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.CYAN);
        
        // Add a button to the second panel using FlowLayout
        Button b1 = new Button("Submit");
        panel2.add(b1);
        Button b2 = new Button("Cancel");
        panel2.add(b2);
        
        // Set layout for the frame and add both panels
        this.setLayout(new GridLayout(2,1));
        this.add(panel1);
        this.add(panel2);

        // Set frame properties
        this.setSize(1000, 1000);
        this.setVisible(true);

        // Add window listener to close the frame
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Main method to create the frame instance
    public static void main(String[] args) {
        new TwoPanelsExample();
    }
}
