package Stack;

public class Client {

	public static void main(String[] args) throws Exception{
		
		simpleStack s = new simpleStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		
		System.out.println(s.pop());
		s.display();
		
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());

	}

}
