package LinkedList;

public class linkedList {
	
	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	
	//traversal
	public void display() {
		Node temp = head;   //initialization
		
		while(temp!=null) {    //condition check
			System.out.print(temp.data+" ");
			temp = temp.next;    //increment
		}
		
	}
	
	public int size() {
		int count = 0;
		Node temp = head;
		
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
		
	}
	
	public boolean isEmpty() {
		//return size()==0;
		return head==null;
	}
	
	
	public int getFirst() throws Exception {
		if(isEmpty()){
			throw new Exception("LL is Empty");
		}
		return head.data;
	}
	
	
	public int getLast() throws Exception {
		if(isEmpty()){
			throw new Exception("LL is Empty");
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		
		return temp.data;
	}
	
	
	public int getAt(int idx) throws Exception {
		if(isEmpty()){
			throw new Exception("LL is Empty");
		}
		
		if(idx<0 || idx>=size()) {
			throw new Exception("Invalid Index.");
		}
		
//		if(idx==0)
//			return getFirst();
//		
//		else if(idx==size()-1)
//			return getLast();
		
		Node temp = head;
		for(int i=0; i<idx; i++) {
			temp = temp.next;
		}
		
		return temp.data;
		
	}
	
	
	private Node getNodeAt(int idx) throws Exception {
		if(isEmpty()){
			throw new Exception("LL is Empty");
		}
		
		if(idx<0 || idx>=size()) {
			throw new Exception("Invalid Index.");
		}
		
		Node temp = head;
		for(int i=0; i<idx; i++) {
			temp = temp.next;
		}
		
		return temp;
	}
	
	
	public void addLast(int item) throws Exception {
		//create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;
		
		if(isEmpty()) {
			head = nn;
		}
		else {
			//linking
			Node last = getNodeAt(size()-1);
			last.next = nn;
		}
	}
	
	public void addFirst(int item) {
		//create new node
		Node nn = new Node();
		nn.data = item;
		
		//linking
		nn.next = head;
		head = nn;
	
	}
	
	
	public void addAt(int idx, int item) throws Exception {
		Node nn = new Node();
		nn.data = item;
		
		if(idx<0 || idx>size())
			throw new Exception("Invalid Index.");
		
		if(idx == 0)
			addFirst(item);
		
		else if(idx == size())
			addLast(item);
		
		else {
			Node n1 = getNodeAt(idx-1);
			Node n2 = getNodeAt(idx);
			
			n1.next = nn;
			nn.next = n2;
		}
	}
	
	public int removeLast() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("LL is Empty.");
		}
		
		int temp = getLast();
		
		if(size()==1) {
			head = null;
		}
		else {
			Node n = getNodeAt(size()-2);
			n.next = null;
		}
		
		return temp;
		
	}
	
	public int removeFirst() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("LL is Empty.");
		}
		
		int temp = getFirst();
		
		if(size()==1) {
			head = null;
		}
		else {
			head = head.next;
		}
		
		return temp;
		
	}
	
	public int removeAt(int idx) throws Exception {
		
		if(isEmpty()) {
			throw new Exception("LL is Empty.");
		}
		
		if(idx<0 || idx>=size()) {
			throw new Exception("Invalid Index.");
		}
		
		if(idx==0)
			return removeFirst();
		
		else if(idx==size()-1)
			return removeLast();
		
		else {
			Node n1 = getNodeAt(idx-1);
			Node n2 = n1.next;
			Node n3 = n2.next;
			
			n1.next = n3;
			return n2.data;
		}
	}
	
	public void LLReverse() {
		
		Node prev = null ;
		Node curr = head;
		
		while(curr!=null) {
			Node ahead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = ahead;
		}
		
		head = prev;
		
	}
	
	public void reverseRecursive() {
		reverseRecursive(null,head);
	}
	
	private void reverseRecursive(Node prev, Node curr) {
		
		if(curr==null) {
			head = prev;
			return;
		}
		
		reverseRecursive(curr, curr.next);
		curr.next = prev;
	}
	
	public int midPoint(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null ) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		
		return slow.data;
	}
	
	public int kthFromLast(int k) {
		Node slow = head;
		Node fast = head;
		while(k!=0) {
			fast = fast.next;
			k--;
		}
		
		while(fast!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}
	
	public Node intersection(Node headA, Node headB) {
		
		Node fp = headA;
		Node sp = headB;
		while(fp!=sp) {
			
			if(fp==null) {
				fp = headB;
			}else {
				fp = fp.next;
			}
			
			if(sp==null) {
				sp = headA;
			}else{
				sp = sp.next;
			}
			
		}
		
		return fp;
	}
	
	public Node mergeSortedLists(Node headA, Node headB) {
		
		Node dummy = new Node();
		Node tail = dummy;
		
		while(headA!=null && headB!=null) {
			
			if(headA.data<=headB.data) {
				tail.next = headA;
				headA = headA.next;
				tail = tail.next;
			}
			else {
				tail.next = headB;
				headB = headB.next;
				tail = tail.next;
			}
		}
		
		if(headA==null) {
			tail.next = headB;
		}
		if(headB==null) {
			tail.next = headA;
		}
		
		return dummy.next;
	}
	
	public boolean Palindrome(Node head) {
		Node[] left = new Node[1];
		left[0] = head;
		return Palindrome(head,left);
	}
	
	public boolean Palindrome(Node right, Node[] left) {
		if(right==null) {
			return true;
		}
		
		boolean res = Palindrome(right.next, left);
		if(left[0].data == right.data && res) {
			left[0] = left[0].next;
			return true;
		}
		else {
			left[0] = left[0].next;
			return false;
		}
	}
	
	
	

}
