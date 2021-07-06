import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class ReadMoney {
	
	  public static void main(String argv[]) throws Exception {
		    FileInputStream fis = new FileInputStream("money.out"); //water stream -- how it flows -- how the file flows
		    ObjectInputStream ois = new ObjectInputStream(fis); // how the object flows
		    try {
		    while (true) {

		    	Money m = (Money) ois.readObject();
		    	System.out.println(m);
		    	
		    }
		    }
		    catch (EOFException e) {
		    	
		    }
		    
		    
//	    	 Quarter q = (Quarter) ois.readObject();
//			    System.out.println("Money is: "+q);
		   
		    ois.close();
		    fis.close();
		  }

}
