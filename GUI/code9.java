// Gridbag Layout

import java.awt.*;
class code9 extends Frame
{
    code9() {
        super("GridBagLayout Demo");
        setSize(600,400);
        setVisible(true);
        GridBagLayout gbl = new GridBagLayout();  
        GridBagConstraints gbc = new GridBagConstraints();  
        setLayout(gbl);


        // gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridx = 0;  
        gbc.gridy = 0;  
        this.add(new Button("Button One"), gbc);  
        gbc.gridx = 1;  
        gbc.gridy = 0;  
        this.add(new Button("Button two"), gbc);  
        gbc.ipadx = 40; //Specifies the internal padding: how much to add to the size of the component
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        this.add(new Button("Button Three"), gbc);  
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        this.add(new Button("Button Four"), gbc); 
        
        

        // // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 0;
        gbc.ipadx = 250;
        gbc.gridx = 0;  
        gbc.gridy = 2;  
        gbc.gridwidth = 2;  
        this.add(new Button("Button Five"), gbc);  

    }
    public static void main(String args[]) {
        code9 f = new code9();
    }
}
