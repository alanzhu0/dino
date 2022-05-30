import javax.swing.JFrame;
import java.io.IOException;;

public class Driver {
   public static void main(String[] args) throws IOException {
      JFrame frame = new JFrame("Dinosaur Game");
      frame.setSize(600, 430);
      frame.setLocation(20, 20);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new GUIPanel());
      frame.setVisible(true);
   }   
}