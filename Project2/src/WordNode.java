/**
 * 
 * @author akil bhuiyan
 * @since 10/26/2020
 * @Version 1
 * @description We will use this node class to store the value and find next
 *              available node which is null with the next pointer.
 */

public class WordNode {
	protected Word data; // protected instance variable
	protected WordNode next; // pointed to next node

	public WordNode(Word data) { // single argument constructor
		this.data = data; // if we give null it will be dummy node
		this.next = null; // last node pointed to null
	}
}