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

public class Lab6Program1 {

	public static void main(String[] args) {

		int[] wordArray = new int[20];
		String fileName = args[0];
		int actualLength = inputFromFile(fileName, wordArray);
		JOptionPane.showMessageDialog(null,"sum: " + sum(wordArray, actualLength) + ",average: " + average(wordArray, actualLength));
	} // main

	public static int sum(int[] myArray, int myArraySize) {
		int s = 0;
		for (int i = 0; i < myArraySize; i++)
			s += myArray[i];
		return s;

	}

	public static int average(int[] myArray, int myArraySize) {

		return sum(myArray, myArraySize) / myArraySize;

	}

	private static int inputFromFile(String filename, int[] numbers) {

		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while (lengthFilled < numbers.length && line != null) {
			numbers[lengthFilled++] = Integer.parseInt(line);
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

} // class Lab6Program1