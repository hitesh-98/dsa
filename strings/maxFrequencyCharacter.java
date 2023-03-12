package strings;
import java.util.*;

public class maxFrequencyCharacter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		maxChar(str);
	}
	
	public static void maxChar(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(hm.containsKey(ch))
			{
				int frequency = hm.get(ch)+1;
				hm.put(ch, frequency);
			}
			else
				hm.put(ch, 1);
		}
		
		char max = str.charAt(0);
		for(Character key: hm.keySet())
		{
			if(hm.get(key)>hm.get(max))
				max = key;
		}
		System.out.println(max);
	}
	
public static void maxChar1(String str) {
		
		int[] count = new int[26];
        int max = 0;
        int result = 0;
        for(int i=0; i<str.length(); i++)
            count[str.charAt(i)-'a']++;

        for(int i=0; i<count.length; i++)
        {
            if(max < count[i])
            {
                max = count[i];
                result = i;
            }
        }
        System.out.println((char)(result+'a'));
	}
		

}
