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
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FileMenuHandler implements ActionListener {
	WordGUI jframe;

	public FileMenuHandler(WordGUI jf) {
		jframe = jf;
	}

	public void actionPerformed(ActionEvent event) {
		String menuName;
		menuName = event.getActionCommand();
		if (menuName.equals("Open"))
			openFile();
		else if (menuName.equals("Quit"))
			System.exit(0);
	} // actionPerformed

	private void openFile() {
		JFileChooser chooser= new JFileChooser("./");
		
		
		int status = chooser.showOpenDialog(null);
		if (status == JFileChooser.APPROVE_OPTION) //APPROVE_OPTION
			readSource(chooser.getSelectedFile());
		else
			JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	} // openFile

	private void readSource(File chosenFile) {
		String chosenFileName = chosenFile.getAbsolutePath();
		JTextArea textArea = new JTextArea(5, 100);
		jframe.setLayout(new GridLayout(1, 3));
		JTextArea ta2 = new JTextArea(5, 100);
		JTextArea ta3 = new JTextArea(5, 100);
		Container myContentPane = jframe.getContentPane();

		textArea.setText("Unsorted List:\n"); // String finalString
		ta2.setText("Sorted List:\n");
		ta3.setText("Erroneous List:\n");
		myContentPane.add(textArea);
		jframe.setVisible(true);
		myContentPane.add(ta2);
		jframe.setVisible(true);
		myContentPane.add(ta3);
		jframe.setVisible(true);

//	          JTextArea myTextArea = new JTextArea();
//	          JTextArea mt2 = new JTextArea();
//	          JTextArea mt3 = new JTextArea();
		t1(chosenFileName, textArea, ta2, ta3);
	}

	// JFileChooser <-- is a built in class to choose file from mac.

	public static void t1(String h, JTextArea myText, JTextArea myText2, JTextArea myText3) { // insert three text area
																								// and get
		// the expected values
		String[] pInputs = new String[300];
		String fileName = (h);

		Word.inputFromFile(fileName, pInputs);

		String x = "";

		for (int i = 0; i < pInputs.length; i++) {
			if (pInputs[i] != null) {

				x += (pInputs[i] + " ");

			}

		}

		// String x = pInputs[0] + " " + pInputs[1] + " " + pInputs[2] + " " +
		// pInputs[3];
		// get our 3 lines in 1 line

		StringTokenizer myTokens = new StringTokenizer(x, " ");

		// inputs is the array for all the word
		String[] inputs;
		inputs = new String[myTokens.countTokens()];

		String[] vWords = new String[300];
		String[] iVWords = new String[300]; // set the max value as default all word.
		int vw = 0;
		int iw = 0;

		int i = 0;

		while (myTokens.hasMoreTokens()) {
			inputs[i] = myTokens.nextToken();
			i++;
		}
		// vWords is the array for all valid the word
		// IVWords is the array for all invalid the word
		for (int k = 0; k < inputs.length; k++) {
			if ((!inputs[k].equals("")) && (inputs[k] != null) && (inputs[k].matches("^[a-zA-Z[.][_][-]]+"))) {

				vWords[vw] = inputs[k];
				vw++;
			} else {
				iVWords[iw] = inputs[k];
				iw++;
			}
		}

		Word.arrange(vWords, vw); // sent the files to make an Alphabetical order specially capital order first

		for (int d = 0; d < vWords.length; d++) {
			if (vWords[d] != null) {
				myText2.append(vWords[d] + " " + "\n");
			} // valid words goes to 2nd text area
		}
		for (int j = 0; j < inputs.length; j++) {
			myText.append(inputs[j] + " " + "\n"); // all words goes to 1st textarea.
		}
		for (int j = 0; j < inputs.length; j++) {
			myText.append(inputs[j] + " " + "\n"); // all words goes to 1st textarea.
		}

		for (int d = 0; d < vWords.length; d++) {
			if (iVWords[d] != null) {
				myText3.append(iVWords[d] + " " + "\n");
			} // invalid words goes to 3rdd text area
		}

	}// t1

}
