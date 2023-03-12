package Stack;
import java.util.*;

public class stackQuestions {

	public static void main(String[] args) throws Exception{
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		//ds.display();
		//displayReverse(ds);
		//ds.display();
		
		//actualReverse(ds,new DynamicStack());
		//ds.display();
		
		int[][] arr = {{0,1,1,1},{1,0,1,0},{0,0,0,0},{1,1,1,0}};
		//celebrityProblem(arr);
		
		int[] arr1 = {11, 13, 21, 3};
		//nextGreaterElement(arr1);
		int[] rsult = nextGreaterElement2(arr1);
		//for(int i=0; i<rsult.length; i++) 
			//System.out.println(arr1[i]+" -> "+rsult[i]);
		
		int[] result = nextGreaterElement3(arr1);
		//for(int i=0; i<result.length; i++)
			//System.out.println(arr1[i]+" -> "+result[i]);
		
		int[] arr2 = {30,35,40,38,35};
		int[] res = stockSpan(arr2);
		for(int i=0; i<res.length; i++)
			System.out.println(arr2[i]+" -> "+ res[i]);
		
		
		
	}
	
	public static void displayReverse(DynamicStack s) throws Exception{
		if(s.isEmpty())
			return;
		
		int temp = s.pop();
		
		displayReverse(s);
		System.out.println(temp);
		s.push(temp);
	}
	
	
	public static void actualReverse(DynamicStack ds, DynamicStack helper) throws Exception{
		if(ds.isEmpty())
		{
			actualReverse2(ds,helper);
			return;
		}
		
		int temp = ds.pop();
		helper.push(temp);
		
		actualReverse(ds,helper);
		
	}
	
	public static void actualReverse2(DynamicStack ds, DynamicStack helper) throws Exception{
		if(helper.isEmpty())
			return;
		
		int temp = helper.pop();
		actualReverse2(ds,helper);
		ds.push(temp);
	}
	
	public static void celebrityProblem(int[][] arr) {
		
		Stack<Integer> s = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			s.push(i);
		}
		
		while(s.size()>=2) {
			int a = s.pop();
			int b = s.pop();
			
			// a knows b, a can't be a celebrity
			if(arr[a][b]==1) {
				s.push(b);
			}
			// a doesn't know b, b can't be a celebrity
			else {
				s.push(a);
			}
			
		}
		
		// candidate can be a celebrity, every row must be 0 and every column must be 1
		int candidate = s.pop();   
		
		for(int i=0; i<arr.length; i++) {
			
			if(i!=candidate) {
				
				if(arr[candidate][i]==1 || arr[i][candidate]==0) {
					System.out.println("no celebrity found");
					return;
				}
			}
			
		}
		
		System.out.println(candidate + " is celebrity");
	
	}
	
	
	public static void nextGreaterElement(int[] arr) {
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			
			while(!s.isEmpty() && arr[i]>=s.peek()) {
				System.out.println(s.pop()+" -> "+arr[i]);
			}
			
			s.push(arr[i]);
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop()+" -> "+"-1");
		}
		
	}
	
	public static int[] nextGreaterElement2(int[] arr) {
		// results in right order
		Stack<Integer> s = new Stack<>();
		int[] index = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			while(!s.isEmpty() && arr[i]>=arr[s.peek()]) {
				index[s.pop()] = arr[i];
			}
			
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			index[s.pop()] = -1;
		}
		return index;
		
	}
	
	public static int[] nextGreaterElement3(int[] arr) {
		Stack<Integer> s = new Stack<>();
		
		int[] res = new int[arr.length];
		
		for(int i=arr.length-1; i>0; i--) {
			
			while(!s.isEmpty() && s.peek()<=arr[i]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				res[i] = -1;
			}
			else {
				res[i] = s.peek();
			}
			
			s.push(arr[i]);
		}
		
		return res;
		
	}
	
	public static int[] stockSpan(int[] arr) {
		
		Stack<Integer> s = new Stack<>();
		int[] ans = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			while(!s.isEmpty() && arr[i] >= arr[s.peek()]) {
				s.pop();
			}
			
			if(s.isEmpty())
				ans[i] = i;
			else
				ans[i] = i-s.peek()-1;
			
			s.push(i);
				
		}
		
		return ans;
	}
	
	
	public static void stackMinimum() {
		
		
	}

		

}
