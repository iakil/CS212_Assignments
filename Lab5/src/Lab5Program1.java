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

public class Lab5Program1 {

	public static void main(String[] args) {

		String[] wordArray = new String[20];
		String fileName = args[0];
		int actualLength = inputFromFile(fileName, wordArray);
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
		}
	} // main

	private static int inputFromFile(String filename, String[] numbers) {

		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while (lengthFilled < numbers.length && line != null) {
			numbers[lengthFilled++] = line;
			line = in.readLine();
		} // while
		if (line != null) { // lengthFilled >= numbers.length
			System.out.println("File contains too many numbers. ");
			System.out.println("This program can process only " + numbers.length + " numbers. ");
			System.exit(1);
		} // if
		in.close();
		return lengthFilled;
	} // method inputFromFile

	/**
	 * check if the input word is in the word array or not
	 * 
	 * @param findMe  user input
	 * @param theList word array
	 * @return true if user input is in the array, otherwise return false
	 */
	public static boolean wordIsThere(String findMe, String[] theList) {

		for (int i = 0; i < theList.length; i++) {

			if (findMe.equals(theList[i])) { // equals compare the value of the string, == compare the memory address.
				return true;

			}

		}

		return false;

	} // wordIsThere
} // class Lab5Program1