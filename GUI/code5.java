// Grid Layout

import java.awt.*;

class code5 extends Frame{

    code5() {
        setSize(500,500);
        setVisible(true);
        setLayout(new GridLayout(2,2,20,20));
        Button l1 = new Button("first box");
        add(l1);
        Button l2 = new Button("second box");
        add(l2);
        Button l3 = new Button("third box");
        add(l3);
        Button l4 = new Button("fourth box");
        add(l4);
        Button l5 = new Button("fifth box");
        add(l5);    
        // Button l6 = new Button("sixth box");
        // add(l6);
        // Button l7 = new Button("seventh box");
        // add(l7);
    }
    public static void main(String[] args) {
        code5 s = new code5();
    }
}


// import java.awt.*;
// import javax.swing.*;

// public class SimpleAWTGridLayout {
//     public static void main(String[] args) {
//         Frame frame = new Frame("AWT GridLayout Example");
//         frame.setLayout(new GridLayout(2, 2));

//         Label nameLabel = new Label("Name:");
//         // TextField nameField = new TextField(20);

//         Label salaryLabel = new Label("Salary:");
//         // TextField salaryField = new TextField(20);

//         Label codeLabel = new Label("Code:");
//         // TextField codeField = new TextField(20);

//         Label desigLabel = new Label("Designation:");
//         // TextField desigField = new TextField(20);

//         frame.add(nameLabel);
//         // frame.add(nameField);
//         frame.add(salaryLabel);
//         // frame.add(salaryField);
//         frame.add(codeLabel);
//         // frame.add(codeField);
//         frame.add(desigLabel);
//         // frame.add(desigField);

//         frame.setSize(500, 500);
//         frame.setVisible(true);
//     }
// }
