import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   public FileMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open"))
         JOptionPane.showMessageDialog(null,"You clicked on Open"); 
      // JFileChooser <-- is a built in class to choose file from mac.
      else if (menuName.equals("Quit"))
    	  System.exit(0);
//          JOptionPane.showMessageDialog(null,"You clicked on Quit"); 
   } //actionPerformed
}
