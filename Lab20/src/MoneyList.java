// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

	/** First node in linked list - dummy node */
	private MoneyNode first = new MoneyNode(null);

	/** Last node in linked list */
	private MoneyNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to the end of this LinkedList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	public void append(Money d) {
		// TODO Code here for append
		
		// step1: create the new node
		MoneyNode newNode = new MoneyNode(d);
		
		// step2: make connections
		last.next = newNode;
		last =  newNode;
		length++;
		
		// step4: check the empty linked list
		

	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(Money d) {
		// TODO Code here for prepend
		
		// step1: create a new node with data d
		MoneyNode newNode = new MoneyNode(d);
		// make the newNode point to the second node
		newNode.next=first.next;
		if(first.next == null)// empty linked list
			last = newNode;
		// step2: make the first node point to the newNode
		first.next=newNode;
		// step3: check the update
		length++;
		// step4: check the empty linked list
		
		

	} // method append(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() {
		MoneyNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString; // contains the whole linked list
		
	}
	
	
	public double sum() {
		MoneyNode p = first.next;
		double sum = 0;
		while (p != null) {
			if (p.data instanceof Bill) // Bill type
				sum+= ((Bill)p.data).getValue(); // dollar amount
			else // coin type 0.25
				sum+=((Coin)p.data).getValue()/100.0; // cents amount
			p = p.next;
		}
		return sum;
		
	}
	
	

	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()  // getClass is same as this.getClass
				|| length != ((MoneyList) other).length)
			return false;

		MoneyNode nodeThis = first;
		MoneyNode nodeOther = ((MoneyList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals

} // class LinkedList

