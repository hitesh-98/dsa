package nagarro;

public class LoveLetter {

	public static void main(String[] args) {
		System.out.println(loveLetter("nitin hitesh hello adaada",3));
	}
	
	public static int loveLetter(String str, int rotate) {
		
		str = str.toLowerCase();
		String[] arr = str.split(" ");
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			int n = rotate;
			n = n%arr[i].length();
			String s = arr[i].substring(arr[i].length()-n) + arr[i].substring(0,arr[i].length()-n);
			
			System.out.println(s);
			if(s.equals(arr[i])) {
				count++;
			}
		}
		
		return count;
		
	}

}
