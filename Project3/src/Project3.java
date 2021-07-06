/**
 * 
 * @author akil bhuiyan
 * @since 11/15/2020
 * @Version 1
 * @description read the input from the choosed file from directory, and collect all the word. then make 3
 *              textarea, where first text  will be unsorted list, 2nd one sorted list
 *               and last one erroneous list. The GUI will have file then open and quit option. open will show the
 *				the list nd quit will exit the program.
 */
public class Project3 {
	static WordGUI wgui;

	public static void main(String[] args) {

		wgui = new WordGUI("Project 3", 1000, 800); // make an object from GUI class then named it as Project 3 then height nd weight set as 1000 nd 800.

	}

}
