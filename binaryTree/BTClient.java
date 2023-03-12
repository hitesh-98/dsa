package binaryTree;

public class BTClient {

	//10 true 20 true 50 false false true 60 false false true 30 false true 70 false false
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		System.out.println();
		bt.display();
		System.out.println(bt.size());
		System.out.println(bt.max());
		System.out.println(bt.find(50));
		System.out.println(bt.height());
		System.out.println(bt.leafNodeCount());
		

	}

}
