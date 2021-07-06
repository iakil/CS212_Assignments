
public class Bill extends Money{ // Bill is the subclass (child class) of Money, Money is the super class ([parent class)of Bill.
   private int dollars;
   
   public Bill (int d) {
	   //super();
      dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   
   public String toString() {
	   
	   return ("$ "+dollars+".00");
	   
	   
   }
   
   
}
