
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon")); // abc is not palindrome abc backword is cba.
		System.out.println(isPalindrome("Madam I'm Adam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
		System.out.println(isPalindrome("A Toyota"));
		System.out.println(isPalindrome("Not a palindrome"));
		System.out.println(isPalindrome("asdfghfdsa"));
	}
	
	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
		return isPalindromeHelper(in.toUpperCase());
	}
	/**
	 * recursive method to check if a given String is palidrome or not
	 * @param in
	 * @return return true if it is a palidrome, return false otherwise.
	 */
	
	private static boolean isPalindromeHelper(String in) {
		
		
		// base case, Empty String or String with the single character, "d" , ""
		
		
		if (in.length()==0 || in.length()==1) // in.length () <2
			return true;
		
		
		
		if(!Character.isLetter(in.charAt(0)))
		
		return isPalindromeHelper(in.substring(1)); // from 1st to end to get rid of first character.
		
		else if (!Character.isLetter(in.charAt(in.length()-1)))  // the first char is not letter, but the last char is not letter
			
			return isPalindromeHelper(in.substring(0, in.length()-1)); // get rid of last chat
			else { // both of the first and last char are letter
				if (in.charAt(0)==in.charAt(in.length()-1))
					return  isPalindromeHelper(in.substring(1 , in.length()-1));
				
				else 
					return false;
				
			}
			
		
		
		
		//recursive steps
		//1. check the first pair
		//2. subprolem is to check the subString except the first pair
		
		
		
		
		
		}
	
}//class
