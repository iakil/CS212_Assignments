/**
 * 
 * @author akil bhuiyan
 * @since 11/15/2020
 * @Version 1
 * @description read the input from the choosed file from directory, and collect all the word. then make 3
 *              textarea, where first text  will be unsorted list, 2nd one sorted list
 *               and last one erroneous list. 
 *				The GUI will have file then open and quit option. open will show the
 *				the list nd quit will exit the program.
 */
public class Word {

	public static int inputFromFile(String filename, String[] numbers) {// read a file and convert or export that on an
		// array

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

	public static String[] arrange(String[] validWords, int validWordsIndex) { // arrange in a format where Capital
		// alphabetical order first then
		// alphabetical order

// i passes from 0 to arraylength - 1
		for (int i = 0; i < validWordsIndex - 1; i++) {
// This is minimum element in an unsorted array
			int min_index = i;
			String minStr = validWords[i];
// j passes from i+1 to arraylength
			for (int j = i + 1; j < validWordsIndex; j++) {
// if current array element is smaller than minimum element, compareTo() returns
// -ve value
				if (validWords[j].compareTo(minStr) < 0) {
// Then makes current array element as minimum element
					minStr = validWords[j];
					min_index = j;
				}
			}
// Swapping minimum element with first element in this iteration
			if (min_index != i) {
				String temp = validWords[min_index];
				validWords[min_index] = validWords[i];
				validWords[i] = temp;
			}
		}
		return validWords;
	}

}// word class
