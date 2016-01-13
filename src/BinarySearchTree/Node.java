package BinarySearchTree;

public class Node {

	private int value;
	private Node left;
	private Node right;
	
	// default constructor
	public Node() {	
		left = null;
		right = null;
	}
	
	// standard constructor
	public Node(int value) {
		this.value = value;
		left = new Node();
		left = null;
		right = new Node();
		right = null;	
	}
	
	// return value of node
	public int GetValue() {
		return value;
	}
	// returns left child node
	// null if it does not exist
	public Node GetLeft() {
		if (left == null) {
			return null;
		}
		
		else {
			return left;
		}
	}
	
	// returns right child node
	// null if it does not exist
	public Node GetRight() {
		if (right == null) {
			return null;
		}
		
		else {
			return right;
		}
	}
	
	// set left child node
	public void SetLeft(Node left) {
		this.left = left;
	}
	
	// set right child node
	public void SetRight(Node right) {
		this.right = right;
	}
	
	public boolean Search(int data) {
		

		if (this.value == data) {
			System.out.println("success");
			return true;
		}
		
		else if (data < this.value) {
			if (GetLeft() != null) {
				System.out.println("Recurse left");
				return GetLeft().Search(data);
			}
			
			else {
				return false;
			}
		}
		
		else if (data > this.value) {
			if (GetRight() != null) {
				System.out.println("Recurse right");
				return GetRight().Search(data);
			}
			
			else {
				return false;
			}
		}
		
		else {
			System.out.println("WHAT");
		}
		
		return false;
	}
	
	public boolean Delete(int value) {
		
		if (value == this.value) {
			if (left == null && right == null) {
				
			}
		}
		
		return false;
	}
}
