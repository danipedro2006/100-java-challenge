package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class Node {

	int data;
	Node left, right = null;
	public int value;

	

	
	public Node(int data) {
		
		this.data = data;
		
	}

	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static Node createTree(int[] parent) {
		
		Map<Integer, Node> map = new HashMap<>();
		
		for (int i = 0; i < parent.length; i++) {
			map.put(i, new Node(i));
		}
		
		Node root = null;

		for (int i = 0; i < parent.length; i++) {
			
			if (parent[i] == -1) {
				root = map.get(i);
			} 
			
			else {
				
				Node ptr = map.get(parent[i]);
				if (ptr.left != null) {
					ptr.right = map.get(i);
				}
				else {
					ptr.left=map.get(i);
				}
			}
		}

		return root;

	}

	
		public static void main(String[] args) {
			int[] parent = { -1, 0, 0, 1, 2, 2, 3, 3 };
			Node root = createTree(parent);
			inorder(root);
		}
		
}

