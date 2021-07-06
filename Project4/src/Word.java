/**
 * 
 * @author akil bhuiyan
 * @since 11/28/2020
 * @Version 1
 * @description read the input from the choosed file from directory, and collect
 *              all the word. then make 2 textarea, where first text will be
 *              unsorted list, 2nd one sorted list The GUI will have file then
 *              open and quit option. open will show the the list nd quit will
 *              exit the program. it store the word in its instance var. return
 *              it in String format with toString method. and check it with
 *              compareTo method. compareToIgnoreCase will sort with ignoring
 *              case.
 */
public class Word implements Comparable<Word> {

	String data;

	public Word(String word) {
		this.data = word;
	}

	public String toString() {
		return this.data;
	}

	public int compareTo(Word o) {

		return (this.data.compareTo(o.data));
	}

}// word class
