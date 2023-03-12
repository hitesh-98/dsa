package nagarro;

public class CutMandN {

	public static void main(String[] args) {
		numberOfTurns("hitesh",1,2);

	}
	
	public static void numberOfTurns(String s, int m, int n) {
		int len = s.length();
		int count = 1;
		int cut = n;
		String cuts = s.substring(len-m)+s.substring(0,len-m);
		
		while((!cuts.equals(s))) {
			
			cuts = cuts.substring(len-cut)+cuts.substring(0,len-cut);
			
			if(cut==n) {
				cut = m;
			}else {
				cut = n;
			}
			
			count++;
			
		}
		System.out.println(count);
	}

}
