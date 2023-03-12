package Queue;

public class simpleQueue {
	protected int[] data;
	protected int front;
	protected int size;
	
	public simpleQueue() {
		data = new int[5];
		front = 0;
		size = 0;
	}
	
	public simpleQueue(int cap) {
		data = new int[cap];
		front = 0;
		size = 0;
	}
	
	
	public void enqueue(int item) throws Exception{
		if(isFull())
			throw new Exception("Queue Is Full.");
		
		int idx = (front+size) % data.length;
		data[idx] = item;
		
		size++;
	}
	
	
	public int dequeue() throws Exception{
		if(isEmpty())
			throw new Exception("Queue Is Empty.");
		
		int temp = data[front];
		data[front] = 0;
		
		front = (front+1) % data.length;
		size--;
		
		return temp;
	}
	
	
	public int peek() throws Exception {
		if(isEmpty())
			throw new Exception("Queue Is Empty.");
		
		return data[front];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size()==data.length;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void display() {
		for(int i=0; i<size; i++)
		{
			int idx = (i+front) % data.length;
			System.out.print(data[idx]+" ");
		}
		
		System.out.println();
	}
}
