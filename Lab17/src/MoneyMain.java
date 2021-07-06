public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q", "D", "N", "P"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
        	 
        	 // subString (beginingIndex) // from the beginingIndex to the en, "hello".subString(3)->"lo"
        	// subString (beginingIndex, endingIndex) inclusive, exclusive, "hello".subString(0,1)->"h"  
        	 
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length())); // ... (dataSource[i].substring(1); is samething
            wallet[i]= new Bill(billValue); // class of objects
         }   
         else {
            if (dataItem == 'Q')
               wallet[i]=new Quarter(); // class of objects
           
            else if (dataItem == 'D') {
            	wallet[i]=new Dime();
            	
            }
            else if (dataItem == 'N') {
            	wallet[i]=new Nickle();
            	
            }
            else if (dataItem == 'P') {
            	wallet[i]=new Penny();
            	
            }
            
         }
         }
      printWallet();
   }
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
         
    	  
//    	 if (wallet[i] instanceof Bill)// IS-A, child class Instanceof child class --> true, child class Instanceof parent class --> true
//            System.out.println("$ "+((Bill)wallet[i]).getValue()+".00"); // casting Bill class cz Money class doesnt have getValue.
//         else// Coin
        	 
        	 
    	  
    	  // ^^ we cover ths code cz bill class we add toString method so we dont need to check w/ if statement anymore. 
    	  
    	  
            System.out.println(wallet[i]); // .toString()
         
      }
   }
}
