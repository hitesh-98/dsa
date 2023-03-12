package binaryTree;

import java.util.Scanner;

public class BinaryTree {

	Scanner scn = new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BinaryTree() {
		root = construct(null,true);
	}
	
	private Node construct(Node parent , boolean ilc) {
		
		//prompt
		if(parent==null) {
			System.out.println("Enter the data for root node : ");
		}else {
			if(ilc) {
				System.out.println("Enter the data for left child of "+parent.data);
			}else {
				System.out.println("Enter the data for right child of "+parent.data);
			}
		}
		//input data for root node
		int item = scn.nextInt();
		//create new node 
		Node nn = new Node();
		nn.data = item;
		
		System.out.println(nn.data +" has left child ? ");
		//input yes/no
		boolean hlc = scn.nextBoolean();
		//create left subtree(smaller problem)
		if(hlc) {
			nn.left = construct(nn,true);
		}
		
		System.out.println(nn.data +" has right child ? ");
		//input yes/no
		boolean hrc = scn.nextBoolean();
		//create right subtree(smaller problem)
		if(hrc) {
			nn.right = construct(nn,false);
		}
		
		return nn;
	}
	
	
	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		
		//base case
		if(node==null) {
			return;
		}
		
		//self work
		String str = "";
		
		if(node.left==null) {
			str += ".";
		}else {
			str += node.left.data;
		}
		
		str += " -> "+node.data+" <- ";
		
		if(node.right==null) {
			str += ".";
		}else {
			str += node.right.data;
		}
		
		System.out.println(str);
		
		//smaller problem
		display(node.left);
		display(node.right);
	}
	
	
	public int size() {
		return size(root);
	}
	
	private int size(Node node) {
		if(node==null) {
			return 0;
		}
		
		int left = size(node.left);
		int right = size(node.right);
		
		return left+right+1;
	}
	
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		if(node==null) {
			return Integer.MIN_VALUE;
		}
		
		int left = max(node.left);
		int right = max(node.right);
		
		return Math.max(node.data, Math.max(left, right));
		
	}
	
	
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		if(node==null) {
			return -1;
		}
		
		int lh = height(node.left);
		int rh = height(node.right);
		
		return Math.max(lh, rh)+1;
		
	}
	
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node node, int item) {
		if(node==null) {
			return false;
		}
		
		if(node.data==item) {
			return true;
		}
		
		boolean lf = find(node.left,item);
		boolean rf = find(node.right,item);
		
		return lf||rf;
	}
	
	
	public int leafNodeCount() {
		return leafNodeCount(root);
	}

	private int leafNodeCount(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		if(node.left==null && node.right==null) {
			return 1;
		}
		
		int lnc = leafNodeCount(node.left);
		int rnc = leafNodeCount(node.right);
		
		return lnc+rnc;
		
	}
	
}
