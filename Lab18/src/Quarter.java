
public class Quarter extends Coin {

      public Quarter () {
         // if we leave it empty it will call default constructor for Coin class super();
         // but Coin has no default constructor so, it will give an error.
    	  super (25);
         
      }
}
