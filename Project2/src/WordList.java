public abstract class WordList {
	protected WordNode first = new WordNode(null);
	protected WordNode last = first;
	protected int length = 0;

	public int getLength() {
		return length;
	}

	public void append(Word w) {
		WordNode nnd = new WordNode(w);
		last.next = nnd;
		last = nnd;
		length++;
	}

	public String toString() {
		WordNode wl = first.next;
		String returnString = "";
		while (wl != null) {
			returnString += wl.data.data + " \n";
			wl = wl.next;
		}
		return returnString;
	}

}