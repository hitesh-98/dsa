package hashmap;

import java.util.HashMap;

public class containsDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(Duplicate(arr));

	}
	
	public static boolean Duplicate(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i))
            {
                int freq = hm.get(i)+1;
                hm.put(i,freq);
            }
            else
                hm.put(i,1);
        }
        
        for(int key : hm.keySet())
        {
            if(hm.get(key)<2)
                return false;
        }
        
        return true;
        
      }

}
