import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class exp6_MousePressed extends Frame implements MouseListener {
   Label lbl1;
   Label lbl2;
   
   exp6_MousePressed() {
      this.setSize(500, 500);
      this.setVisible(true);
      this.setLayout(new FlowLayout());
      this.lbl1 = new Label(" ", 1);
      this.lbl2 = new Label(" ", 2);
      this.addMouseListener(this);
      this.add(this.lbl1);
      this.add(this.lbl2);
   }
   
   public void mouseClicked(MouseEvent var1) {
   }

   public void mouseExited(MouseEvent var1) {
   }

   public void mousePressed(MouseEvent var1) {
      this.lbl1.setText("x: " + var1.getX());
      this.lbl2.setText("y: " + var1.getY());
   }

   public void mouseEntered(MouseEvent var1) {
   }

   public void mouseReleased(MouseEvent var1) {
   }


   public static void main(String[] var0) {
      new exp6_MousePressed();
   }
}