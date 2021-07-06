/**
 * 
 * @author akil bhuiyan
 * @since 10/26/2020
 * @Version 1
 * @description this class had its parents class named WordList which gives all
 *              the constructor except protected one nd this class will find the
 *              value in order, when we call this class shuld able to display
 *              sorted data from the Project2nput file.
 * 
 * 
 */

public class SortedWordList extends WordList {

	public SortedWordList() {
	}

	public void add(Word w) {
		WordNode n1 = new WordNode(w);
		WordNode k = first;
		while (k.next != null && k.next.data.compareTo(n1.data) < 0) {

			// this loop will itterate until it doesnt find
			// the wanted node, and we dont need to add value to our last node

			k = k.next;
		}
		if (k.next == null) {
			append(w);
		}
		if (k.next.data.compareTo(n1.data) > 0) {
			n1.next = k.next;
			k.next = n1; // compare object and class value
		}

		length++;
	}
}