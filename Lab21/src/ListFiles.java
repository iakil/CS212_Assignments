// we dont need input.txt for ths project 21 i put it there for nothing lmao

import java.io.File;
import javax.swing.*;
public class ListFiles {

	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser(); //by default, it will open Home Directory if using Mac, and 
        //It will open Document if using windows
        // ./ represents current directory
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile(); // eg . src
		listFiles(f,"");

	}
	// recursive method
	public static void listFiles(File f, String indent) {
		File files[] = f.listFiles(); // list all the file in the current directory
		
		
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			System.out.print(indent+f2.getName());
			System.out.print("...");
			System.out.print(f2.lastModified());
			System.out.print("...");
			System.out.print(f2.length());
			System.out.println();
            if (f2.isDirectory())
                listFiles(f2, indent+"   ");
		}
	}
}
