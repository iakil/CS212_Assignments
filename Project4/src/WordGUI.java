
/**
 * 
 * @author akil bhuiyan
 * @since 11/28/2020
 * @Version 1
 * @description read the input from the choosed file from directory, and collect all the word. then make 3
 *              textarea, where first text  will be unsorted list, 2nd one sorted list
 *               and last one erroneous list. 
 *				The GUI will have file then open and quit option. open will show the
 *				the list nd quit will exit the program.
 */

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class WordGUI extends JFrame {

	public WordGUI(String title, int h1, int w1) {

		setTitle(title); // same as this.setTitle(title);
		setSize(h1, w1);
		setLocation(400, 400);
		createFileMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	} // SSNGUI

	private void createFileMenu() {
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		FileMenuHandler fmh = new FileMenuHandler(this); // this refers to sampleGUI
		EditMenuHandler emh = new EditMenuHandler(this);
		item = new JMenuItem("Open"); // Open...
		item.addActionListener(fmh); // it is used listen the actions
		fileMenu.add(item);

		fileMenu.addSeparator(); // add a horizontal separator line

		item = new JMenuItem("Quit"); // Quit
		item.addActionListener(fmh);
		fileMenu.add(item);

		setJMenuBar(menuBar);
		menuBar.add(fileMenu);

		item = new JMenuItem("Search"); // Open...
		item.addActionListener(emh); // it is used listen the actions
		editMenu.add(item);

		setJMenuBar(menuBar);
		menuBar.add(editMenu);

	} // createMenu

	public void t(ArrayList<Word> t1, TreeMap<Word, String> t2) {//
		setLayout(new GridLayout(1, 2));
		JTextArea ta1 = new JTextArea(5, 50);

		JTextArea ta2 = new JTextArea(5, 50);
		Container myContentPane = getContentPane();

		ta1.setText("Unsorted List:\n"); // String finalString
		ta2.setText("Sorted List:\n");

		myContentPane.add(ta1);
		setVisible(true);
		myContentPane.add(ta2);
		setVisible(true);

		for (int i = 0; i < t1.size(); i++) {
			ta1.append(t1.get(i).toString() + "\n");
		}

		Iterator<Word> it;
		it = t2.keySet().iterator();
		while (it.hasNext()) {
			ta2.append(it.next().toString() + "\n");

		}

		setVisible(true);

	}

} // SSNGUI
