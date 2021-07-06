
/**
 * 
 * @author akil bhuiyan
 * @since 11/28/2020
 * @Version 1
 * @description read the input from the choosed file from directory, and collect all the word. then make 2
 *              textarea, where first text  will be unsorted list, 2nd one sorted list
 *               The GUI will have file then open and quit option. open will show the
 *				the list nd quit will exit the program.
 *				there will be 2 menubar. one is file nd other is edit.
 *				file will have the ability to open the input txt nd sort nd quit can exit nd edit will search 
 *				the user input word on the list.
 */
import java.util.ArrayList;
import java.util.TreeMap;

public class Project4 {

	public static ArrayList<Word> l1 = new ArrayList<Word>();
	public static TreeMap<Word, String> l2 = new TreeMap<Word, String>();
	public static WordGUI myGui;

	public static void main(String[] args) {
		myGui = new WordGUI("Akil's Project4", 1000, 800);

	}

}
