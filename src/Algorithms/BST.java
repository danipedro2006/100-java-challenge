// simple implementation of binary tree data structure

package Algorithms;

import java.util.Stack;

public class BST {
	private static class Node {
		private int data;
		private Node left, right;

		private Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public boolean isEmpthy() {
		return null == root;
	}

	public int size() {
		Node current = root;
		int size = 0;
		Stack<Node> stack = new Stack<Node>();
		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				size++;
				current = stack.pop();
				current = current.right;
			}
		}
		return size;
	}

	public void clear() {
		root = null;
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);

		System.out.println(tree.size());
	}

}

class AppTest {

	public static void main(String[] args) {
		// int[] data = {3, 4, 5, 1, 2, 5, 6, 7, 8, 9};

		BinaryTree bt = new BinaryTree();
		bt.add(2);
		bt.add(6);

		bt.traverseInOrder(bt.getRoot());
	}

}