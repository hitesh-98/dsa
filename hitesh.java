
/*One of the streets in your city has a total of L street lights. Each light i covers the street from
Xi to Yi distance. Find the length of street covered with light.
Input Specification:
input1: L, denoting the number of street lights.
input2: An array of L* 2 elements. For each row i, (Xi, Yi) denote that the
street light i covers the distance from Xi to Yi.
Output Specification:
Your function should return the length of the street covered with light.
Example 1:
input1: 1,
input2: {{5,10 } }
Output: 5​
*/
import java.util.*;

public class hitesh {

	public static void main(String[] args) {
//		int[][] arr = { { 2, 3 }, { 5, 9 }, { 5, 10 } };
//		System.out.println(max(arr));
		
		int[] arr = {0,0,2,1,0,1,2,0};
		sort012(arr);
		for(int val : arr) {
			System.out.print(val+" ");
		}
		

	}

	public static int max(int[][] arr) {
		
		int dist = arr[0][1] - arr[0][0];
		int prev = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[prev][1] > arr[i][0]) {
				dist += arr[i][1] - arr[prev][1];
			} else {
				dist += arr[i][1] - arr[i][0];
			}

			prev = i;
		}
		
		return dist;
	}
	
	//sorted array
	public static void sum(int[] arr, int sum) {
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]>sum) {
				j--;
			}else if(arr[i]+arr[j]<sum) {
				i++;
			}else {
				System.out.println(arr[i]);
				System.out.println(arr[j]);
				i++;
				j--;
			}
		}
	}
	
	//sort an array of 0,1,2
	//[0,0,2,,1,0,1,2,0]
	
	public static void sort012(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while(mid<=high) {
			
			if(arr[mid]==0) {
				
				int temp =arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				low++;
				mid++;
				
			}else if(arr[mid]==1) {
				mid++;
			}else {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				
				high--;
			}
		}
	}
	
	public static void stockSell(int[] price) {
		
		int tp = 0;
		int pist = 0;
		int lsf = Integer.MAX_VALUE;
		
		for(int i=0; i<price.length; i++) {
			
			if(price[i]<lsf) {
				lsf = price[i];
			}
			
			pist = price[i]-lsf;
			
			if(pist>tp) {
				tp = pist;
			}
		}
		
		System.out.println(tp);
		
	}
	
	
	public static int[] coPrimePairs(int[] arr) {
		int[] res = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=1; j<=arr[i]; j++) {
				if(gcd(arr[i],j)) {
					count++;
				}
			}
			
			res[i] = count;
		}
		
		return res;
	}
	
	public static boolean gcd(int divident, int divisor) {
		
		while(divident!=0) {
			int rem = divident/divisor;
			divident = divisor;
			divisor = rem;
		}
		
		if(divisor==1) {
			return true;
		}else {
			return false;
		}
	}

}
