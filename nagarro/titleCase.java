package nagarro;

public class titleCase {

	public static void main(String[] args) {
		titlecase("my  NNme");

	}
	
	public static void titlecase(String str) {
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append( (char) ((int) str.charAt(0)-32) );
		for(int i=1; i<str.length(); i++)
		{
			if(str.charAt(i-1)==' ' && str.charAt(i)!=' ')
				sb.append( (char) ((int) str.charAt(i)-32) );
			else
				sb.append(str.charAt(i));
		}
		System.out.println(sb);
	
	}

}
