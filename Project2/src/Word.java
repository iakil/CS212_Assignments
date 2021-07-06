/**
 * 
 * @author akil bhuiyan
 * @since 10/26/2020
 * @Version 1
 * @description it will return the string value if class object and object class
 *              value is same. used for another child classes such as uL sL..
 * 
 */
public class Word {
	protected String data;

	public Word(String w) {
		data = w; // constructor one argument where instance variable is protected
	}

	int compareTo(Word obj) {
		return (this.data.compareTo(obj.data)); // class data to object class data compare
	}
}