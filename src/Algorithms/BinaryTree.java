package Algorithms;

public class BinaryTree {
	Node root;

	public Node getRoot() {
		return root;
	}

	public Node insertNode(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = insertNode(current.left, value);

		} 
		
		else if (value > current.value) {
			current.right = insertNode(current.right, value);

		} 
			return current;
	}

	
	public void traverseInOrder(Node node) {

		if (node != null) {

			traverseInOrder(node.left);
			System.out.print(node.value + " ");
			traverseInOrder(node.right);
		}

	}
	
	public void add(int value) {

		root = insertNode(root, value);
	}
}
