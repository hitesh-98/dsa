package nagarro;

public class javaToC {
	public static void main(String[] args) {
		String str = "this_is_variable";
		String str1 = "ThisIsVariable";
		System.out.println(modify(str1));
	}
	
	public static String modify(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='_') {
				return modifyC(str);
			}
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				return modifyJava(str);
			}
		}
		return "";
	}
	
	public static String modifyC(String str) {
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='_') {
				i++;
				sb.append(Character.toUpperCase(arr[i]));
			}
			else {
				sb.append(arr[i]);
			}
		}
		
		return sb.toString();
 	}
	
	public static String modifyJava(String str) {
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z' && i!=0) {
				sb.append('_');
				sb.append(arr[i]);
			}
			else {
				sb.append(arr[i]);
			}
		}
		
		return sb.toString().toLowerCase();
	}
}
