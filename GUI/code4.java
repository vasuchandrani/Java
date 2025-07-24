// Flow Layout 

import java.awt.*;

class code4 extends Frame {
    code4(){
        super("FlowLayOut Demo");
        setSize(600,400);

        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        Button b1 = new Button("Submit");
        add(b1);
        Button b2 = new Button("Cancel");
        add(b2);

        TextField t1 = new TextField(1);
        add(t1);

        // TextArea t = new TextArea();
        // add(t);
        setVisible(true);
    }
    public static void main(String args[]) {
        @SuppressWarnings("unused")
        code4 f = new code4();
    }
}


// import java.awt.*;

// class code4 extends Frame {
//     code4() {
//         super("FlowLayOut Demo");
//         setLayout(new FlowLayout()); // Set layout before making frame visible
//         setSize(600, 400);

//         Button b1 = new Button("Submit");
//         add(b1);
//         Button b2 = new Button("Cancel");
//         add(b2);

//         TextField t1 = new TextField(1);
//         add(t1);

//         TextArea t = new TextArea("vatsal");
//         add(t);

//         setVisible(true); // Make frame visible after adding components
//     }

//     public static void main(String args[]) {
//         @SuppressWarnings("unused")
//         code4 f = new code4();
//     }
// }
