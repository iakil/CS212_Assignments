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
 
import javax.swing.*;
@SuppressWarnings("serial")
public class WordGUI extends JFrame {

	public WordGUI(String title, int height, int width) {

		setTitle(title); // same as this.setTitle(title);
		setSize(height, width);
		setLocation(400, 200);
		createFileMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	} // SSNGUI

	private void createFileMenu() {
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		FileMenuHandler fmh = new FileMenuHandler(this); // this refers to sampleGUI

		item = new JMenuItem("Open"); // Open...
		item.addActionListener(fmh); // it is used listen the actions
		fileMenu.add(item);

		fileMenu.addSeparator(); // add a horizontal separator line

		item = new JMenuItem("Quit"); // Quit
		item.addActionListener(fmh);
		fileMenu.add(item);

		setJMenuBar(menuBar);
		menuBar.add(fileMenu);

	} // createMenu

} // SSNGUI
