
/**
 * 
 * @author akil bhuiyan
 * @since 10/26/2020
 * @Version 1
 * @description  read the file using TextFileInput then use WordGUI to view it
 * 				there will be 2 section or column, where 1st will read the file and print 
 * 				to the left or first column which is known as unSortedList.
 * 				then we use sortedList class to sort the value in order where sysbol-number capital case nd lower
 * 				case.
 *              
 */
import java.util.StringTokenizer;

public class Project2 {
	public static void main(String[] main) {

		TextFileInput l1 = new TextFileInput("Project2Input.txt"); // read the input file named Project2Input
		SortedWordList sL = new SortedWordList();
		UnsortedWordList uL = new UnsortedWordList(); // make a new object from that class to store value
		String ln = l1.readLine(); // read the line and get the value as an order from TextFileInput method called
									// readLine
		String x = "";
		while (ln != null) {
			x += ln + " "; // add the list in one line with an space so next line comes with a space
			ln = l1.readLine();
		}

		StringTokenizer myTokens = new StringTokenizer(x);

		while (myTokens.hasMoreTokens()) {

			String word = myTokens.nextToken();
			Word w = new Word(word);
			sL.add(w);
			uL.add(w); // StringTokenize each String and add it to the pergect slot means sL or uL.

		}

		WordGUI gui = new WordGUI();
		gui.display(uL, sL); // display from WordGUI with our disired way and design
	}
}