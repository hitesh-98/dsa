package LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {
		linkedList ll = new linkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.display();
		System.out.println();
		//ll.LLReverse();
		ll.reverseRecursive();
		ll.display();
		
		
		

	}

}
