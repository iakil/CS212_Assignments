/**
 * 
 * @author akil bhuiyan
 * @since 11/28/2020
 * @Version 1
 * @description read the input from the choosed file from directory, and collect all the word. then make 2
 *              textarea, where first text  will be unsorted list, 2nd one sorted list 
 *				The GUI will have file then open and quit option. open will show the
 *				the list nd quit will exit the program.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;
import javax.swing.*;

public class FileMenuHandler implements ActionListener {
	public static StringTokenizer tokenizer;
	public static TextFileInput in;
	public static String line;
	JFrame jframe;

	public FileMenuHandler(JFrame jf) {
		jframe = jf;
	}

	public void actionPerformed(ActionEvent event) {
		String menuName;
		menuName = event.getActionCommand();
		if (menuName.equals("Open")) {
			openFile();
			Project4.myGui.t(Project4.l1, Project4.l2);
		} else if (menuName.equals("Quit"))
			System.exit(0);
	} // actionPerformed

	private void openFile() {
		JFileChooser chooser = new JFileChooser("./");

		int status = chooser.showOpenDialog(null);
		if (status == JFileChooser.APPROVE_OPTION) // APPROVE_OPTION
			readSource(chooser.getSelectedFile());
		else
			JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	} // openFile

	private void readSource(File chosenFile) {
		String chosenFileName = chosenFile.getAbsolutePath();

		TextFileInput in = new TextFileInput(chosenFileName);

		line = in.readLine();
		String pInput = "";

		while (line != null) { // lengthFilled >= numbers.length
			pInput += line + " ";
			line = in.readLine();
		}
		tokenizer = new StringTokenizer(pInput, " ");
		String w = "";
		while (tokenizer.hasMoreTokens()) {
			w = tokenizer.nextToken();
			Word word = new Word(w);
			Project4.l1.add(word);
			Project4.l2.put(word, w);

		}

	}

}
