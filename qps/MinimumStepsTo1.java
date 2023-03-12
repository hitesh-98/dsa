package qps;

public class MinimumStepsTo1 {

	public static void main(String[] args) {
		System.out.println(minStepsTopDown(10,new int[11]));

	}
	
	public static int minSteps(int n) {
		
		if(n==1)
			return 0;
		
		int ans = minSteps(n-1);
		
		if(n%2==0) {
			ans = Math.min(ans,minSteps(n/2));
		}
		else if(n%3==0) {
			ans = Math.min(ans,minSteps(n/3));
		}
		
		return ans+1;    //one operation is performed i.e -1,/2,/3
	}
	
	public static int minStepsTopDown(int n, int[] strg) {
		if(n==1)
			return 0;
		
		
		if(strg[n]!=0)   
			return strg[n]; //reuse
		
		int ans = minStepsTopDown(n-1,strg);
		
		if(n%2==0) {
			ans = Math.min(ans,minStepsTopDown(n/2,strg));
		}
		else if(n%3==0) {
			ans = Math.min(ans,minStepsTopDown(n/3,strg));
		}
		
		strg[n] = ans+1;  //store
		
		return ans+1;    //one operation is performed i.e -1,/2,/3
		
	}

}
