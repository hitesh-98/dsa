package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {10,3,7,30,-100};
		
		int[] result = mergeSort(arr,0,arr.length-1);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");

	}
	
	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
		int[] merged = new int[one.length+two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<one.length && j<two.length){
			
			if(one[i]<two[j]){
				merged[k] = one[i];
				k++;
				i++;
			}else{
				merged[k] = two[j];
				k++;
				j++;
			}
		}
		
		while(i<one.length){
			merged[k] = one[i];
			i++;
			k++;
		}
		
		while(j<two.length){
			merged[k] = two[j];
			j++;
			k++;
		}
		
		return merged;
	}
	
	
	//TC - O(n log n) in all cases
	//SC - O(n)
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		
		if(low==high)
		{
			int[] ba = new int[1];
			ba[0] = arr[low];
			return ba;
		}
		
		int mid = (low+high)/2;
		int[] sp1 = mergeSort(arr,low,mid);
		int[] sp2 = mergeSort(arr,mid+1,high);
		
		int[] res = mergeTwoSortedArrays(sp1,sp2);
		
		return res;
		
	}

}
