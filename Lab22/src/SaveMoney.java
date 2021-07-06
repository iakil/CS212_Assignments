import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SaveMoney {
	public static void main(String argv[]) throws Exception {
	    FileOutputStream fos = new FileOutputStream("money.out");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    for(int i=0; i<10; i++) {
	    	Quarter q = new Quarter();
		    oos.writeObject(q);
		    
		    Bill b = new Bill(20);
		    oos.writeObject (b);
		    
		    Nickle n = new Nickle();
		    oos.writeObject (n);
		    
		    Penny p = new Penny();
		    oos.writeObject (p);
		    
	    }
	    
	    oos.flush();
	    oos.close();
	    fos.close();
	  }

}
