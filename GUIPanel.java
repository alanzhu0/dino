import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class GUIPanel extends JPanel {
   private GamePanel gfx;

   public GUIPanel() throws IOException {
      setLayout(new BorderLayout());
      // Center
         gfx = new GamePanel();
         add(gfx);

      // North \
      // East   -> Nothing
      // West  /

      // South
      JPanel south = new JPanel();
      south.setLayout(new GridLayout(1, 3));

      JButton regular = new JButton("Regular Dino");
         regular.addActionListener(new regularListener());
         south.add(regular);
      JButton fire = new JButton("Fire Dino");
         fire.addActionListener(new fireListener());
         south.add(fire);
      JButton superdino = new JButton("Super Dino"); // variable called superdino because super is reserved
         superdino.addActionListener(new superListener());
         south.add(superdino);
      add(south, BorderLayout.SOUTH);
      
   } // public GUIPanel()

   private class regularListener implements ActionListener { // REGULAR
      public void actionPerformed(ActionEvent e) {
         try { setDino('r'); } 
         catch (IOException e1) { e1.printStackTrace(); }
      }
   }
   private class fireListener implements ActionListener {    // FIRE
      public void actionPerformed(ActionEvent e) {
         try { setDino('f'); } 
         catch (IOException e2) { e2.printStackTrace(); }
         
      }
   }
   private class superListener implements ActionListener {   // SUPER
      public void actionPerformed(ActionEvent e){
         try { setDino('s'); } 
         catch (IOException e3) { e3.printStackTrace(); }
      }
   }

   public void setDino(char a) throws IOException {
      gfx.reset(a);
      gfx.requestFocusInWindow();
      gfx.begin();
   }

   
} // public class GUIPanel extends JPanel