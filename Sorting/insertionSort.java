package Sorting;

public class insertionSort {

	public static void main(String[] args) {
		int[] arr = {88,77,66,55,44,33,22,11,-1};
		insertion(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}
	
	//place ith element at its correct position in one pass
	
	//TC
	//best - O(n)   when array is already sorted   , n comparison , 0 swaps
	//average -  O(n square)
	//worst - O(n square)  when array is in decreasing order , n^2 comparison , n^2 swaps
	public static void insertion(int[] arr) {
	
		for(int i=1; i<arr.length; i++) {
			
			for(int j=i-1; j>=0; j--) {
				
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}else {
					break;
				}
			}
		}
	}
	

}
