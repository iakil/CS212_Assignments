import java.io.File;

import javax.swing.JFileChooser;

public class ListLargestFile {
	
	static File largestFile;	// global variables, it is class-level
	static long largestLength = 0;
	
	// in java, its not allowed to have local static variables.
	
	
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser(); // () <-- whole directory or ("./") <-- current directory
        //by default, it will open Home Directory if using Mac, and 
        //It will open Document if using windows
        // ./ represents current directory
        
        
        
        
        
        
        
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile(); //the choosen file or folder eg . src
		listFiles(f,"");
		System.out.println("The largest file is"+largestFile.getName()+", and its length is: "+largestLength);
		
		

	}
	// recursive method
	public static void listFiles(File f, String indent) { // recursive method
		File files[] = f.listFiles(); // list all the file in folder f. 
		
		
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			if(f2.length()>largestLength) {
				
				largestFile=f2;
				largestLength=f2.length();
				
				
			}
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
