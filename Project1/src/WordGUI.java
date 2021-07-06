import java.awt.GridLayout;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * 
 * @author akil bhuiyan
 * @since 09/16/2020
 * @Version 1
 * @description read the input text sentence and collect all the word and make 3
 *              textarea, where 1 text area will be all words, 2nd one all valid
 *              words and last one invalid words
 *
 */

public class WordGUI {

	public static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Project1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);// width, height); //size of the window
		frame.setLocation(200, 200);// x, y); // location of the window
		frame.setLayout(new GridLayout(1, 3)); // 1 row 3 column

		JTextArea textArea = new JTextArea(5, 100);
		textArea.setEditable(false); // not editable
		frame.getContentPane().add(textArea);

		JTextArea textArea2 = new JTextArea(5, 100);// text area row and column
		textArea2.setEditable(false);
		frame.getContentPane().add(textArea2);

		JTextArea textArea3 = new JTextArea(5, 100);
		textArea3.setEditable(false);
		frame.getContentPane().add(textArea3); // container

//        JLabel label = new JLabel("The sum of the numbers in the matrix is: ");
//        frame.getContentPane().add(label);

		textArea.setText("All Words:\n"); // String finalString
		frame.setVisible(true);

		textArea2.setText("Valid Words:\n");
		frame.setVisible(true);

		textArea3.setText("Invalid Words:\n");
		frame.setVisible(true);

		// Display the window.
//        frame.pack();

		t1(textArea, textArea2, textArea3);

	}

	public static void t1(JTextArea myText, JTextArea myText2, JTextArea myText3) { // insert three text area and get
																					// the expected values
		String[] pInputs = new String[300];
		String fileName = ("Project1Input.txt");

		Project1.inputFromFile(fileName, pInputs);
		
		
		String x = "";
		
		
		for (int i = 0; i<pInputs.length; i++) {
			if (pInputs[i]!=null) {
				
		      x += (pInputs[i]+" ");
		      
				}
		
			}

		// String x = pInputs[0] + " " + pInputs[1] + " " + pInputs[2] + " " + pInputs[3]; 
		// get our 3 lines in 1 line

		StringTokenizer myTokens = new StringTokenizer(x, " ");

		// "inputs" is an array for all the word
		String[] inputs;
		inputs = new String[myTokens.countTokens()];

		String[] vWords = new String[300];
		String[] iVWords = new String[300]; 
		int vw = 0;
		int iw = 0;

		int i = 0;

		while (myTokens.hasMoreTokens()) {
			inputs[i] = myTokens.nextToken();
			i++;
		}
//  vWords is the array for all valid the word
//  IVWords is the array for all invalid the word
		for (int k = 0; k < inputs.length; k++) {
			if ((!inputs[k].equals("")) && (inputs[k] != null) && (inputs[k].matches("^[a-zA-Z[.][_][-]]+"))) {

				vWords[vw] = inputs[k];
				vw++;
			} else {
				iVWords[iw] = inputs[k];
				iw++;
			}
		}

		
		
		
		
		Project1.arrange(vWords, vw); // sent the files to make an Alphabetical order specially capital order first

		for (int d = 0; d < vWords.length; d++) {
			if (vWords[d]!=null) {
			myText2.append(vWords[d] + " " + "\n");} // valid words go to 2nd text area
		}
		for (int j = 0; j < inputs.length; j++) {
			myText.append(inputs[j] + " " + "\n"); // all words go to 1st text area.
		}

		for (int d = 0; d < vWords.length; d++) {
			if(iVWords[d]!=null) {
			myText3.append(iVWords[d] + " " + "\n");} // invalid words go to 3rdd text area
		}

	}

}