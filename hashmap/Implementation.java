package hashmap;

public class Implementation {

	private class Node{
		String key;
		Integer value;
		Node next;
		
		public Node(String key, Integer value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private Node bucketArray[];
	private int size;
	
	public Implementation() {
		this(4);
	}
	
	public Implementation(int cap) {
		bucketArray = new Node[cap];
		size = 0;
	}
	
	private int hashFunction(String key) {
		
		int hc = key.hashCode();
		int bn = hc % bucketArray.length;
		return bn;
	}
	
	public void put(String key, Integer value) {
		int bn = hashFunction(key);
		Node temp = bucketArray[bn];
		
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			
			temp = temp.next;
		}
		
		//key not present
		Node nn = new Node(key,value);
		Node head = bucketArray[bn];
		
		nn.next = head;
		bucketArray[bn] = nn;
		size++;
		
	}
	
	public Integer get(String key) {
		
		int bn = hashFunction(key);
		Node temp  = bucketArray[bn];
		while(temp!=null) {
			if(temp.key.equals(key))
				return temp.value;
			
			temp = temp.next;
		}
		
		return null;
	}
	
	public boolean containsKey(String key) {
		int bn = hashFunction(key);
		Node temp  = bucketArray[bn];
		while(temp!=null) {
			if(temp.key.equals(key))
				return true;
			
			temp = temp.next;
		}
		
		return false;
	}
	
	public Integer remove(String key) {
		int bn = hashFunction(key);
		Node temp = bucketArray[bn];
		Node prev = null;
		while(temp!=null) {
			if(temp.key.equals(key)) {
				break;
			}
			
			prev = temp;
			temp = temp.next;
		}
		
		//key not present
		if(temp==null)
			return null;
		
		//key present(break statement)
		if(prev == null) {
			bucketArray[bn] = temp.next;
		}
		else
			prev.next = temp.next;
		
		size--;
		return temp.value;
		
	}
}

