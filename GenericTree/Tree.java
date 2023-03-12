package GenericTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {

	Scanner scn = new Scanner(System.in);
	private class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	
	private Node root;
	
	public Tree(){
		root = construct(null,-1);
	}
	
	private Node construct(Node parent, int ith) {
		//prompt
		if(parent==null) {
			System.out.println("Enter the data for root node : ");
		}else {
			System.out.println("Enter the data for "+ith+ " child of "+parent.data+" : ");
		}
		//take input of data
		int item = scn.nextInt();
		//create new node
		Node nn = new Node();
		//update the data
		nn.data = item;
		
		//prompt
		System.out.println("Enter the number of children of "+nn.data+" : ");
		//take input of children
		int noc = scn.nextInt();
		//loop
		for(int j=0; j<noc; j++) {
			Node child = construct(nn,j);
			nn.children.add(child);
		}
		
		return nn;
		
	}
	
	
	public void display() {
		display(root);
	}
	
	private void display(Node node) {
		
		//self work
		String str = node.data + "->";
		for(Node child : node.children) {
			str += child.data+" ";
		}
		str += ".";
		System.out.println(str);
		
		//smaller problem
		for(Node child : node.children) {
			display(child);
		}
	}
	
	
	public int size() {
		return size(root);
	}
	
	private int size(Node node) {
		
		int ts = 0;
		for(Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}
		
		return ts+1;
		
	}
	
	
	public int max() {
		return max(root);
	}
	
	private int max(Node node) {
		
		int tm = node.data;
		for(Node child : node.children) {
			int cm = max(child);
			if(cm>tm) {
				tm = cm;
			}
		}
		
		return tm;
	}
	
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node node, int item) {
		
		if(node.data==item) {
			return true;
		}
		
		for(Node child : node.children) {
			boolean cf = find(child,item);
			
			if(cf) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		
		int th = -1;
		for(Node child : node.children) {
			int ch = height(child);
			
			if(ch>th) {
				th = ch;
			}
		}
		
		return th+1;
	}
	
	
	public void mirror() {
		mirror(root);
	}
	
	private void mirror(Node node) {
		//smaller problem
		for(Node child : node.children) {
			mirror(child);
		}
		
		//self work
//		int i = 0;
//		int j = node.children.size()-1;
//		
//		while(i<=j) {
//			
//			Node ith = node.children.get(i);
//			Node jth = node.children.get(j);
//			
//			node.children.set(i,jth);
//			node.children.set(j, ith);
//			
//			i++;
//			j--;
//			
//		}
		
		Collections.reverse(node.children);
		
	}
	
	
	public void printAtLevel(int level) {
		printAtLevel(root,level,0);
	}
	
	private void printAtLevel(Node node, int level, int count) {
		
		if(level==count) {
			System.out.println(node.data);
			return;
		}
		
		for(Node child : node.children) {
			printAtLevel(child,level,count+1);
		}
	}
	
	
	public void preorder() {
		preorder(root);
	}
	
	private void preorder(Node node) {
		System.out.print(node.data+" ");
		for(Node child : node.children) {
			preorder(child);
		}
	}
	
	
	public void postorder() {
		postorder(root);
	}
	
	private void postorder(Node node) {
		
		for(Node child : node.children) {
			preorder(child);
		}
		System.out.print(node.data+" ");
	}
	
	
	public void levelorder() {
		Queue<Node> q = new LinkedList<>();
		//add root node 
		q.add(root);
		
		while(!q.isEmpty()) {
			//remove node
			Node rn = q.remove();
			//print data of removed data
			System.out.println(rn.data+" ");
			
			//enque all children of removed node
			for(Node child : rn.children) {
				q.add(child);
			}
		}
		System.out.println();
	}
	
	
	public void levelorderLineWise() {
		Queue<Node> pq = new LinkedList<>();
		Queue<Node> hq = new LinkedList<>();
		//add root node 
		pq.add(root);
		
		while(!pq.isEmpty()) {
			//remove node
			Node rn = pq.remove();
			//print data of removed data
			System.out.println(rn.data+" ");
			
			//enque all children of removed node
			for(Node child : rn.children) {
				hq.add(child);
			}
			
			//if pq is empty insert new line and change references
			if(pq.isEmpty()) {
				System.out.println();
				Queue<Node> temp = pq;
				pq = hq;
				hq = temp;
			}
		}
		
	}
	
	
	public void levelorderZigZag() {
		
		
	}
	
	
	
}


