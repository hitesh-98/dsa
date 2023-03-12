package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void intersection(int[] one, int[] two) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int key : one) {
			int nf = hm.getOrDefault(key, 0) + 1;
			hm.put(key, nf);
		}
		
		for(int key : two) {
			if(hm.containsKey(key) && hm.get(key)>0) {
				hm.put(key, hm.get(key)-1);
			}
		}
		
		
	}

}
