/**
 * author: Isara Ritthaworn
 * description: 
 * 
 * This is an implementation of a singly linked list
 * 
 * 		methods:
 * 				- append // append to end of list
 * 				- delete // delete value if exists
 * 				- printList // prints the entire list
 * 				- isEmpty // true if empty else false
 * 				- search // true if value exists
 * 				- getSize // return size of list
 * 				- incSize // increment size
 * 				- decSize // decrement size
*/				
package List;

public class List {

	Node head;
	int size;
	
	// default constructor
	List() {
		head = new Node();
		size = 0;
	}

	public int getSize() {
		return size;
	}
	
	public void incSize() {
		size++;
	}
	
	public void decSize() {
		size--;
	}
	
	// append value to linked list
	public void append(int value) {
		
		// create new node to append to the end of the linked list
		Node newNode = new Node(value);
		
		// traverse to linked list until the last node is reached
		Node currentNode = head;
		while (currentNode.getNext() != null) {
			
			// move current node to next node
			currentNode = currentNode.getNext();
		}
		
		// set last node's next variable to 
		currentNode.setNext(newNode);
		incSize();
	}
	
	// prints the entire list
	public void printList() {
	
		Node current = head;
		if (head.getNext() == null) {
			System.out.println("list is empty");
		}
		
		else {
			current = head.getNext();
			while (current.getNext() != null) {
				
				System.out.print(current.getValue() + " ");
				current = current.getNext();
			}
			
			// print out last node
			System.out.print(current.getValue() + "\n");
		}
	}
	
	// checks whether or not the list is empty
	public boolean isEmpty() {
		
		if (head.getNext() == null) {
			return true;
		}
		
		return false;
	}
	
	public boolean search(int value) {
		
		Node current = head;		
		if (head.getNext() != null) {
			current = head.getNext();
			
			if (current.getNext() == null && current.getValue() == value) {
				return true;
			}
			
			else {
				
				while(current.getNext() != null) {
					
					if (current.getValue() == value) {
						return true;
					}
					
					current = current.getNext();
					
				}
				
				// flushes out the last value
				if (current.getValue() == value) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void delete(int value) {
		
		Node current = head;
		
		if (isEmpty()) {
			System.out.println("list is empty");
		}
		
		else if (!search(value)) {
			System.out.println("value does not exist in list");
		}
		
		else if (size == 1 && head.getNext().getValue() == value) {
			
			// delete node
			Node delete = head.getNext();
			delete = null;
			
			head.setNext(null);
			decSize();
		}
		
		else {
			
			current = head.getNext();
			Node previous = head;
			Node next = current.getNext();
			if (current.getValue() == value) {
				previous.setNext(next);
				current = null;
				decSize();
			}
			
			else {
				while (current.getNext() != null) {
					if (current.getValue() == value) {
						previous.setNext(next);
						current = null;
						decSize();
						return;
					}
					
					else {
						previous = current;
						current = current.getNext();
						next = current.getNext();
					}
				}
				
				// flush out last node
				if (current.getValue() == value) {
					previous.setNext(next);
					current = null;
					decSize();
				}
			}
		}
	}
}
