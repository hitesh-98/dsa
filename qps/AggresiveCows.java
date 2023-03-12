package qps;

import java.util.Arrays;

public class AggresiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int aggresiveCows(int[] arr, int cows) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr[arr.length-1]-arr[0];
		int ans = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(isPossible(arr,cows,mid)) {
				ans = mid;
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return ans;
	}
	
	public static boolean isPossible(int[] arr, int totalCows, int minDistance) {
		int cowsPlaced = 1;
		int lastCowPos = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-lastCowPos >= minDistance) {
				cowsPlaced++;
				lastCowPos = arr[i];
			}
			
			if(cowsPlaced==totalCows) {
				return true;
			}
		}
		
		return false;
	}

}
