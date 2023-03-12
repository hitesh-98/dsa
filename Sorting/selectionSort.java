package Sorting;

public class selectionSort {

	public static void main(String[] args) {
		int[] arr = {88,77,66,55,44,33,22,11};
		selection(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	//place smallest element at its correct position in one pass
	
	//TC
	//best - O(n square)   when array is already sorted   , n^2 comparison , 0 swaps
	//average -  O(n square)
	//worst - O(n square)  when array is in decreasing order , n^2 comparison , n swaps
	
	public static void selection(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++){
			
			int min = i;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}

}
