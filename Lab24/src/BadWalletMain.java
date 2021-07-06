
public class BadWalletMain {

	static String[] dataSource = { "B5", "Q", "Q", "B10", "P", "N", "D", "Q", "D" }; // remove tns comment
	static Wallet myWallet = new Wallet();

	public static void main (String[] args) {
   // try / catch begins here         
      for (int i=0;i<dataSource.length;i++) {
    	  try {
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            myWallet.addToWallet(new Bill(billValue));
         }   
         else
            if (dataItem == 'Q')
               myWallet.addToWallet(new Quarter());
            else
            if (dataItem == 'D')
               myWallet.addToWallet(new Dime());
            else
            if (dataItem == 'N')
               myWallet.addToWallet(new Nickel());
            else
            if (dataItem == 'P')
               myWallet.addToWallet(new Penny());
   
      } // try method
    	  
    	  catch (IllegalBillException e)  { 
    	  System.err.println(e.getMessage()+"\n"+dataSource[i]);
    	  }
    	  
    	  catch (NumberFormatException e)   {
    	  System.err.println(e.getMessage()+"\n"+dataSource[i]);
    	  }
    	  
      } // for loop 
    	  
    	  
	  myWallet.print();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
   }
   
	}
	
