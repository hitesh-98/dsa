package Queue;

public class client {

	public static void main(String[] args) throws Exception{
		
		simpleQueue q = new simpleQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		
		System.out.println(q.dequeue());
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
	}

}
