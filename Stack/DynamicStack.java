package Stack;

public class DynamicStack extends simpleStack {
	
	@Override
	public void push(int item) throws Exception {
		if(isFull())
		{
			int[] na = new int[2*data.length];    //new array of double size
			
			for(int i=tos; i>=0; i--)      //copy old elements in new array
				na[i] = data[i];
			
			data = na;          //change reference to new array
		}
		
		super.push(item);
	}

}
