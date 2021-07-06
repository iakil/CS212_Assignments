
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
 */
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;

public class WordGUI {
	private JFrame wordsGUI;
	private Container myContentPane;
	private TextArea UtextArea;
	private TextArea StextArea;

	public WordGUI() {
		wordsGUI = new JFrame();
		wordsGUI.setTitle("Project2"); // title

		wordsGUI.setLayout(new GridLayout(1, 2));
		myContentPane = wordsGUI.getContentPane();
		UtextArea = new TextArea();
		UtextArea.setEditable(false); // not editable
		StextArea = new TextArea();
		StextArea.setEditable(false); // not editable
		myContentPane.add(UtextArea);
		myContentPane.add(StextArea);

		wordsGUI.setSize(1000, 1000); // length nd width is 1000nd 1000
		wordsGUI.setLocation(200, 200); // location of the screen view is 200 nd 200

		wordsGUI.setVisible(true); // we can see it

		wordsGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // can able to close it
	}

	public void display(WordList uWL, WordList sWL) {

		UtextArea.append(uWL.toString()); // view the list on there when we call display method on main method

		StextArea.append(sWL.toString());

	}
}