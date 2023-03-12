package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {10,3,7,30,-100};
		
		quickSort(arr,0,arr.length-1);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");

	}
	
	public static void quickSort(int[] arr, int low, int high) {
		
		if(low>=high)
			return;
		
		//partitioning
		int mid = (low+high)/2;
		int pivot = arr[mid];
		
		int left = low;
		int right = high;
		
		while(left<=right)
		{
			while(arr[left]<pivot)        //left points towards problem
				left++;
			
			while(arr[right]>pivot)       //right points towards problem
				right--;
			
			
			if(left<=right) {
				int temp = arr[left];         //solve problem by swapping
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		
		quickSort(arr,low,right);
		quickSort(arr,left,high);
	}

}
