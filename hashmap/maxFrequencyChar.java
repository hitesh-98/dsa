package hashmap;

import java.util.HashMap;

public class maxFrequencyChar {

	public static void main(String[] args) {
		System.out.println(maxFreqChar("abbcc"));

	}
	
	public static char maxFreqChar(String s) {
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(hm.containsKey(ch)) {
				int freq = hm.get(ch)+1;
				hm.put(ch, freq);
			}
			else
				hm.put(ch, 1);
		}
		
		char max = s.charAt(0);
		for(char key : hm.keySet()) {
			
			if(hm.get(key)>hm.get(max))
				max = key;
		}
			
		return max;

	}

}
