
/**
 * 
 * @author akil bhuiyan
 * @since 09/16/2020
 * @Version 1
 * @description search the user input to count the upper and lower case e's
 *
 */

import javax.swing.JOptionPane;

public class Project0 {
	public static void main(String[] args) {
		while (true) {

			String userInput = JOptionPane.showInputDialog(null, "Please enter a sentence.");
			// ask the user to type in a sentence or word

			if (userInput.equalsIgnoreCase("stop")) // stop is not case sensitive and it stops the while loop.
				System.exit(0); // it also close the JOptionPane pop-up window
			if (true)

				JOptionPane.showMessageDialog(null, count(userInput));
			// Output to a JOptionPane window, count upper and lower case e's

		}

	}

	/**
	 * 
	 * Check in the string for upper and lower case e's
	 * 
	 * @param s user input
	 * @return x in String by counting upper and lower case e's
	 * 
	 */
	public static String count(String s) {

		int countCe = 0; // count capital e and by default the value is 0
		int countLe = 0; // count lower e and by default the value is 0
		String x;
		for (int i = 0; i < s.length(); i++) { // scan the whole sentence from 0th position till end

			if (s.charAt(i) == 'E') // scan the whole sentence and look for upper case E and count to countCe
				countCe += 1;
			if (s.charAt(i) == 'e') // scan the whole sentence and look for lower case e and count to countLe
				countLe += 1;
		}
		x = "Number of upper case e's: " + countCe + " \n" + "Number of lower case e's: " + countLe;
		// storing the final outcome in x

		return x;
	}

}
