package strings;
import java.util.Scanner;

public class stringCompression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		compression(str);

	}
	
	public static void compression(String str) {
		int count = 1;
		String compressed = str.charAt(0)+"";
		for(int i=1; i<str.length(); i++)
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr==prev)
				count++;
			else
			{
				if(count>1)
					compressed += count;
				compressed += curr;
				count = 1;
			}
		}
		if(count>1)
			compressed += count;
		System.out.println(compressed);
	}

}
