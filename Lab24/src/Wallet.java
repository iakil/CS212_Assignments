import java.math.BigDecimal;

public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
	  
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
	  
  }
  public void print () {
	  
	  
	  
	  
//	  walletContents.printInOrder(walletContents.getFirst().next);
	  
	  walletContents.printReverseOrder(walletContents.getFirst().next);
	  
	  
	  
//	  System.out.println(walletContents.toString()); // String representation for the whole linked list
	   
	  
  }
  
  
  
  /**
   * 
   * @return the sum of the linked list
   */
  
  
  
  
  
  public String getValue() {
	  
//	  BigDecimal b = new BigDecimal (walletContents.sumMoney(walletContents.getFirst().next)).setScale(2, BigDecimal.ROUND_HALF_UP);	  
	  BigDecimal b = new BigDecimal (walletContents.sumQuarter(walletContents.getFirst().next)).setScale(2, BigDecimal.ROUND_HALF_UP);
	  
	  
	  
	  
	  
	  
//	  BigDecimal b = new BigDecimal (walletContents.sum()).setScale(2, BigDecimal.ROUND_HALF_UP);    //.setScale(n, BigDecimal.ROUND_HALF_UP) -- n means position after decimal.

	  return ""+b;     // walletContents.sum()  gives 35.-------------- , so we round it in b using built in class BigDecimal.
	  
  }
}
