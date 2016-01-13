package List;

public class Node {

	// data members
	private int value;
	private Node next;
	
	// default constructor
	Node() {
		
		// find other value to set instead of MAX_VALUE
		this.value = Integer.MAX_VALUE;
		this.next = null;
	}
	
	// standard constructor
	Node(int value) {
		this.value = value;
		this.next = null; 
	}
	
	// get next variable
	public Node getNext() {
		return next;
	}
	
	// set next variable
	public void setNext(Node node) {
		next = node;
	}
	
	// get value variable
	public int getValue() {
		return value;
	}
}





