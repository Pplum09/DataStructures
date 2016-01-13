package BinarySearchTree;

public class Driver {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println(tree.GetNodeCount());
		tree.Insert(tree.GetRoot(), 5);
		System.out.println(tree.GetNodeCount());
		tree.Insert(tree.GetRoot(), 2);
		System.out.println(tree.GetNodeCount());
		tree.Insert(tree.GetRoot(), 6);
		System.out.println(tree.GetNodeCount());
		tree.Insert(tree.GetRoot(), 3);
		System.out.println(tree.GetNodeCount());
	}
}
