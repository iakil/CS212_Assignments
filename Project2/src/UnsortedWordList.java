
/**
 * 
 * @author akil bhuiyan
 * @since 10/26/2020
 * @Version 1
 * @description it can store all the data and add it to its linkedlist means
 *              Unsortedlist then we can able to apppend it as the userinput
 * 
 * 
 * 
 * 
 * 
 */

public class UnsortedWordList extends WordList { // parent class wordList

	public UnsortedWordList() { // default constructor
	}

	public void add(Word w) {
		append(w); // append the value by adding each value on the listt.
	}
}