package nagarro;

public class removeSubstrings {

	public static void main(String[] args) {
		System.out.println(remove("abcabcd","ab","c","cd"));
	}
	
	public static int remove(String input1, String input2, String input3, String input4) {
		int len = input1.length();
		
		int len1 = input1.length();
		while(true)
		{
			input1 = input1.replace(input2, "");
			input1 = input1.replace(input3, "");
			input1 = input1.replace(input4, "");
			int len2 = input1.length();
			
			if(len2==len1) {
				len = len2;
				break;
			}
			len1 = len2;
		}
		
		return len;
	}

}
