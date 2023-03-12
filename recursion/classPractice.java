package recursion;

public class classPractice {

	public static void main(String[] args) {
		
		//PD(5);
		//PI(5);
		//PDI(5);
		//PID(0,4);
		//System.out.println(factorial(4));
		//System.out.println(power(3,4));
		//System.out.println(fibonacci(4));
		//pattern(3);
		//ruler(3,4);
		//int[] arr = {10,20,30,40,30,50,30};
		//printArray(arr,0);
		//printReverseArray(arr,0);
		//System.out.println(findMax(arr,0));
		//System.out.println(linearSearch_FirstOcc(arr,0,70));
		//int[] result = findAllOcc(arr,0,30,0);
		//for(int i=0; i<result.length;i++)
			//System.out.print(result[i]+" ");
		//subsequences("abc","");
		//ascii_subsequences("ab","");
		//keypadCombination("123","");
		//coinToss(3,"");
		validParenthesis(3,0,0,"");
		//climbingStairs(0,5,"");
		//mazePath(0,0,2,2,"");
		//permutation("abcd","");
		//noConsecutiveHeads(3,"",false);
		//lexicoCounting(1000,0);
		//jumpingNumbers(100,0);
		//stringPartition("nitin","");
		//stringPalindromePartition("nitin", "");
	}
	
	public static void PD(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");
		PD(n-1);
	}
	
	public static void PI(int n) {
		if(n==0)
			return;
		PI(n-1);
		System.out.print(n+" ");
	}
	
	public static void PDI(int n) {
		if(n==0)
			return;
		
		System.out.print(n+" ");
		PDI(n-1);
		System.out.print(n+" ");
	}
	
	public static void PID(int start, int n) {
		if(start>n)
			return;
		
		System.out.print(start+" ");
		PID(start+1,n);
		System.out.print(start+" ");
	}
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		
		int fnm = factorial(n-1);
		int fact = n*fnm;
		return fact;
	}
	
	public static int power(int b, int e) {
		if(e==0)
			return 1;
		
		int rr = power(b,e-1);
		int result = rr*b;
		return result;
	}
	
	public static int fibonacci(int n ) {
		if(n==0||n==1)
			return n;
		
		int fnm1 = fibonacci(n-1);
		int fnm2 = fibonacci(n-2);
		int result = fnm1+fnm2;
		return result;
	}
	
	public static void pattern(int tickLength) {
		if(tickLength==0)
			return;
		
		pattern(tickLength-1);
		for(int i=0; i<tickLength; i++)
			System.out.print("-"+" ");
		System.out.println();
		pattern(tickLength-1);
	}
	
	public static void ruler(int inch, int major_tickLength) {

		for(int i=0; i<major_tickLength; i++)
			System.out.print("-"+" ");
		System.out.println(0);
		
		for(int i=0; i<inch; i++)
		{
			pattern(major_tickLength-1);
			
			for(int j=0; j<major_tickLength; j++)
				System.out.print("-"+" ");
			System.out.println(i);
		}
		
	}
	
	public static void printArray(int[] arr, int vidx) {
		if(vidx==arr.length)
			return;
		
		System.out.print(arr[vidx]+" ");
		printArray(arr,vidx+1);
	}
	
	public static void printReverseArray(int[] arr, int vidx) {
		if(vidx==arr.length)
			return;
		
		printReverseArray(arr,vidx+1);
		System.out.print(arr[vidx]+" ");
	}
	
	public static int findMax(int[] arr, int vidx) {
		if(vidx==arr.length-1)
			return arr[vidx];
		
		int sp = findMax(arr,vidx+1);
		int bp = Math.max(arr[vidx], sp);
		return bp;
	}
	
	public static int linearSearch_FirstOcc(int[] arr, int vidx, int item) {
		if(vidx==arr.length)
			return -1;
		
		if(arr[vidx]==item)
			return vidx;
		int sp = linearSearch_FirstOcc(arr,vidx+1,item);
		return sp;
	}
	
	public static int linearSearch_lastOcc(int[] arr, int vidx, int item) {
		if(vidx==arr.length)
			return -1;
		
		int sp = linearSearch_lastOcc(arr,vidx+1,item);
		if(arr[vidx]==item && sp == -1)
			return vidx;
		
		return sp;
	}
	
	public static int[] findAllOcc(int[] arr, int vidx, int item, int count) {
		if(vidx==arr.length)
		{
			int[] ba = new int[count];
			return ba;
		}
		
		if(arr[vidx]==item)
		{
			int[] rr = findAllOcc(arr,vidx+1,item,count+1);
			rr[count] = vidx;
			return rr;
		}
		else
		{
			int[] rr = findAllOcc(arr,vidx+1,item,count);
			return rr;
		}
	}
	
	public static void subsequences(String ques, String ans) {
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);		//rest of ques (removing first char)
		
		subsequences(roq,ans);       //char not present
		subsequences(roq,ans+ch);    //char present
	}
	
	public static void ascii_subsequences(String ques, String ans) {
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		ascii_subsequences(roq,ans);
		ascii_subsequences(roq,ans+ch);
		ascii_subsequences(roq,ans+(int)ch);
	}
	
	public static String getcode(char ch) {
		if(ch=='1')
			return "abc";
		else if(ch=='2')
			return "def";
		else if(ch=='3')
			return "ghi";
		else if(ch=='4')
			return "jkl";
		else if(ch=='5')
			return "mno";
		else if(ch=='6')
			return "pqrs";
		else if(ch=='7')
			return "tuv";
		else if(ch=='8')
			return "wx";
		else if(ch=='9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return"";
	}
	
	public static void keypadCombination(String ques, String ans) {
		if(ques.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String code = getcode(ch);
		
		for(int i=0; i<code.length(); i++)
			keypadCombination(roq, ans+code.charAt(i));
	}
	
	public static void coinToss(int n, String ans) {
		if(n==0)
		{
			System.out.print(ans+" ");
			return;
		}
			
		coinToss(n-1, ans+"H");
		coinToss(n-1, ans+"T");
		
	}
	
	public static void validParenthesis(int n, int open, int close, String ans) {
		if(open>n || close>n)  //negative base case
			return;
		
		if(open==n && close==n)  //positive base case
		{
			System.out.println(ans);
			return;
		}
		
		validParenthesis(n,open+1,close,ans+"(");
		validParenthesis(n,open,close+1,ans+")");
	}
	
	public static void climbingStairs(int curr, int n, String ans) {
		
		if(curr>n)   //negative base case
			return;
		
		if(curr==n)   //positive base case
		{
			System.out.println(ans);
			return;
		}
		
		climbingStairs(curr+1,n,ans+"1");
		climbingStairs(curr+2,n,ans+"2");
		climbingStairs(curr+3,n,ans+"3");
	}
	
	public static void mazePath(int currRow, int currCol, int endRow, int endCol, String ans) {
		if(currRow>endRow || currCol>endCol)
			return;
		
		if(currRow==endRow && currCol==endCol)
		{
			System.out.println(ans);
			return;
		}
		
		mazePath(currRow+1,currCol,endRow,endCol,ans+"V");
		mazePath(currRow,currCol+1,endRow,endCol,ans+"H");
		mazePath(currRow+1,currCol+1,endRow,endCol,ans+"D");
		
	}
	
	public static void permutation(String ques, String ans) { 
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
	
		for(int i=0; i<ques.length(); i++)
		{
			char ch = ques.charAt(i);
			String roq = ques.substring(0,i)+ques.substring(i+1);
			
			permutation(roq,ans+ch);
		}
	}
	
	public static void noConsecutiveHeads(int n, String ans, boolean flag) {
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		if(flag)  //last element head
			noConsecutiveHeads(n-1, ans+"T",false);
		else
		{
			noConsecutiveHeads(n-1, ans+"H",true);
			noConsecutiveHeads(n-1, ans+"T",false);
		}
	}
	
	public static void lexicoCounting(int n, int curr) {
		if(curr>n)
			return;
		
		System.out.print(curr+" ");
		
		int i = 0;
		
		if(curr==0)
			i=1;
		
		while(i<=9)
		{
			lexicoCounting(n,curr*10+i);
			i++;
		}
	}
	
	public static void jumpingNumbers(int n, int curr) {
		if(curr>n)
			return;
		
		System.out.println(curr);
		if(curr==0)
		{
			for(int i=1; i<=9; i++)
				jumpingNumbers(n,i);
		}
		
		else
		{
			int rem = curr%10;
		
			if(rem!=0)
				jumpingNumbers(n,curr*10+rem-1);
			if(rem!=9)
				jumpingNumbers(n,curr*10+rem+1);
		}
	}
	
	public static void stringPartition(String ques, String ans) {
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=1; i<=ques.length(); i++)
		{
			String part = ques.substring(0,i);
			String roq = ques.substring(i);
			
			stringPartition(roq,ans+part+" ");
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		int i = 0;
		int j = str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void stringPalindromePartition(String ques, String ans) {
		
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=1; i<=ques.length(); i++)
		{
			String part = ques.substring(0,i);
			String roq = ques.substring(i);
			
			if(isPalindrome(part))
				stringPalindromePartition(roq,ans+part+" ");
		}
	}
	
	
	

}
