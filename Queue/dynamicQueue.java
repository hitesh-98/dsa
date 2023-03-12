package Queue;

public class dynamicQueue extends simpleQueue{
	
	@Override
	public void enqueue(int item) throws Exception {
		if(isFull())
		{
			int[] na = new int[2*data.length];     //new array of double size
			
			for(int i=0; i<size; i++)             //copy old values
			{
				int idx = (i+front) % data.length;
				na[i] = data[idx];
			}
			
			data = na;            //change reference
			front = 0;
		}
		
		super.enqueue(item);
	}
}
