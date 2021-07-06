import javax.swing.*;
import java.awt.event.*;
public class EditMenuHandler implements ActionListener {
   JFrame jframe;
   public EditMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Find"))
         JOptionPane.showMessageDialog(null,"You clicked on Find"); 
      // JFileChooser <-- is a built in class to choose file from mac.
      else if (menuName.equals("Replace"))
//    	  System.exit(0);
          JOptionPane.showMessageDialog(null,"You clicked on Replace"); 
   } //actionPerformed
}
