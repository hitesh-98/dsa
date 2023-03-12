package Stack;

public class simpleStack {

	protected int[] data;
	protected int tos;
	
	public simpleStack() {
		data = new int[5];
		tos = -1;
	}
	
	public simpleStack(int cap) {
		data = new int[cap];
		tos = -1;
	}
	
	
	public void push(int item) throws Exception{
		if(isFull())
			throw new Exception("Stack Is Full.");
		
		tos++;
		data[tos] = item;
	}
	
	
	public int pop() throws Exception{
		if(isEmpty())
			throw new Exception("Stack Is Empty.");
		
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		
		return temp;
	}
	
	
	public void display() {
		
		for(int i=tos; i>=0; i--)
			System.out.print(data[i]+" ");
		
		System.out.println();
	}
	
	
	public int peek() throws Exception{
		if(isEmpty())
			throw new Exception("Stack Is Empty.");
		
		return data[tos];
	}
	
	public boolean isFull() {
		return size()==data.length;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public int size() {
		return tos+1;
	}
	
}
