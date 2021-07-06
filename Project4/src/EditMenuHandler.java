
/**
 * 
 * @author akil bhuiyan
 * @since 11/28/2020
 * @Version 1
 * @description there will be a menubar named Edit. where only one option which is search. It will get a String from user 
 * 				and will check from the input txt. if it found it will show isfound or it will display
 * 				isnotfound.
 *              
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EditMenuHandler implements ActionListener {
	JFrame jframe;

	public EditMenuHandler(JFrame jf) {
		jframe = jf;
	}

	public void actionPerformed(ActionEvent event) {
		String isOrIsNot;

		String menuName = event.getActionCommand();
		if (menuName.equals("Search")) {
			String inputWord = JOptionPane.showInputDialog(null, "Please enter a word.");

			if (inputWord.equalsIgnoreCase("stop")) {
				System.exit(0);
			}
			if (wordIsThere(inputWord, Project4.l1))
				isOrIsNot = "is"; // set to is if the word is on the list

			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list

			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " \n" + isOrIsNot + " on the list.");
			// main
		}

	}

	public static boolean wordIsThere(String findMe, ArrayList<Word> t1) {

		for (int i = 0; i < t1.size(); i++) {

			if (findMe.equals(t1.get(i).toString())) { // equals compare the value of the string, == compare the memory
														// address.
				return true;

			}

		}

		return false;

	}

}
