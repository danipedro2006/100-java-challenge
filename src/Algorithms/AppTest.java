package Algorithms;

public class AppTest {

	public static void main(String[] args) {
		//int[] data = {3, 4, 5, 1, 2, 5, 6, 7, 8, 9};
		
		BinaryTree bt =new BinaryTree();
		bt.add(2);	
		bt.add(6);
		
		bt.traverseInOrder(bt.getRoot());
	}

	

}
