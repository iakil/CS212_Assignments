import javax.swing.*; // import the library
// java api application programming interface

/**
 * 
 * @author akil bhuiyan
 * @since 09/18/2020
 * @version 1
 * @description search the user input to check if it is in the word array or not
 *
 */

public class Lab4Program1 {

	public static void main(String[] args) {

		String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" }; // string literal
		String isOrIsNot, inputWord;
		

		// This line asks the user for input by popping out a single window
		// with text input
		// GUI graphical user interface

		while (true) {

			// ask the user to type in a word

			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			if (inputWord.equals("stop")) // equals is case sensitive
				System.exit(0);
			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, wordArray))
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list

			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " \n" + isOrIsNot + " on the list.");
		} // main
	}

	/**
	 * check if the input word is in the word array or not
	 * 
	 * @param findMe  user input
	 * @param theList word array
	 * @return tru if user input is in the array, otherwise return false
	 */
	public static boolean wordIsThere(String findMe, String[] theList) {

		for (int i = 0; i < theList.length; i++) {

			if (findMe.equals(theList[i])) { // equals compare the value of the string, == compare the memory address.
				return true;

			}

		}

		return false;

	} // wordIsThere
} // class Lab4Program1