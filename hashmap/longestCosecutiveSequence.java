package hashmap;

import java.util.HashMap;

public class longestCosecutiveSequence {

	public static void main(String[] args) {
		

	}
	
	public static void longestConsecutiveSeq(int[] arr) {
		HashMap<Integer,Boolean> hm = new HashMap<>();
		//iterate to check if an element can form a sequence
		for(int key : arr) {
			if(hm.containsKey(key-1)) {
				hm.put(key, false);
			}
			else {
				hm.put(key, true);
			}
			
			if(hm.containsKey(key+1)) {
				hm.put(key+1, false);
			}
		}
		
		
		//check maximum count of a longest consecutive sequence
		//check starting point of the longest consecutive sequence
		int max = 0;
		int startingPoint = 0;
		for(int key : hm.keySet()) {
			if(hm.get(key)) {
				int count = 0;
				while(hm.containsKey(key+count))
					count++;
				
				if(count>max) {
					max = count;
					startingPoint = key;
				}
			}
		}
		
		//print elements from starting point till maxcount
		for(int i=0; i<max; i++)
			System.out.println(startingPoint+i);
	}

}
