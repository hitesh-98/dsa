package DP;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10000;
		System.out.println(fibonacciTopDown(n, new int[n+1]));
		System.out.println(fibonacciBottomUp(n));
		System.out.println(fibonacciBUSpaceEfficient(n));

	}
	
	//time - O(n)   space - O(n) && recursion Space extra
	public static int fibonacciTopDown(int n, int[] storage) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(storage[n]!=0)
			return storage[n];     //re-use previously computed values
		
		int fnm1 = fibonacciTopDown(n-1, storage);
		int fnm2 = fibonacciTopDown(n-2, storage);
		int fn = fnm1+fnm2;
		
		storage[n] = fn;  //store computed values 
		return fn;
	}
	
	//time - O(n)   space - O(n)
	public static int fibonacciBottomUp(int n) {
		
		//create array of size n+!
		int[] storage = new int[n+1];
		
		//fill base case values
		storage[0] = 0;
		storage[1] = 1;
		
		//iterate in right direction of array
		for(int i=2; i<storage.length; i++) {
			storage[i] = storage[i-1]+storage[i-2];
		}
		
		return storage[n];
	}
	
	//time - O(n)   space - O(1)
	public static int fibonacciBUSpaceEfficient(int n) {
		
		int[] storage = new int[2];
		storage[0] = 0;
		storage[1] = 1;
		
		for(int slide=0; slide<n-1; slide++) {
			
			int sum = storage[0]+storage[1];
			storage[0] = storage[1];
			storage[1] = sum;
		}
		
		return storage[1];

	}

	

}
