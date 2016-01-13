package BinarySearchTree;

public class BinarySearchTree {
	
	private Node root;
	private int NodeCount;
	
	// default constructor
	public BinarySearchTree() {
		root = null;
		NodeCount = 0;
	}
	
	public Node GetRoot() {
		return root;
	}
	
	public void Insert(Node root, int value) {
		
		if (root == null) {
			Node newNode = new Node(value);
			this.root = newNode;
			NodeCount++;
		}
		
		else if (value < root.GetValue()) {
			
			// if the left child does not exist set left child
			// to new node
			if (root.GetLeft() == null) {
				
				// create node
				Node newNode = new Node(value);
				root.SetLeft(newNode);
				NodeCount++;
			}
			
			// if the left child does exist, recursive step
			else if (root.GetLeft() != null) {
				Insert(root.GetLeft(), value);
			}
			
			else {
				throw new Error(); 
			}
		}
		
		else if (value > root.GetValue()) {
			
			// if the right child does not exist set right child
			// to new node
			if (root.GetRight() == null) {
				
				// create node
				Node newNode = new Node(value);
				root.SetRight(newNode);
				NodeCount++;
			}
			
			// if the right child does exist, recursive step
			else if (root.GetRight() != null) {
				Insert(root.GetRight(), value);
			}
			
			else {
				throw new Error(); 
			}
		}
		
		else {
			throw new Error();
		}
	}
	
	// returns true if value exists, else false
	public boolean Search(int value) {
		
		if (root == null) {
			System.out.println("tree is empty");
			return false;
		}
		
		else {
			return root.Search(value);
		}
	}
	
	public int GetNodeCount() {
		return NodeCount;
	}
	
	public void Delete(int value) {
		
		if (root == null) {
			System.out.println("Tree is empty");
			return; 
		}
		
		else {
			if (!root.Delete(value)) {
				System.out.println("value does not exist");
			}
		}
	}
}
