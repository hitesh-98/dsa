package backtracking;

import java.util.*;

public class subsetsCase1 {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		int[] arr = {1,2,3};
 		elementRespect(arr,0, new ArrayList<>(),list);
 		System.out.println(list);

	}
	
	public static void elementRespect(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> list) {
		if(vidx == arr.length)
		{
			list.add(new ArrayList<>(temp));
			return;
		}
		
		temp.add(arr[vidx]);
		elementRespect(arr,vidx+1,temp,list);
		temp.remove(temp.size()-1);
		elementRespect(arr,vidx+1,temp,list);    
		
	}
	
	public static void userRespect(int[] arr,int vidx, List<Integer> temp, List<List<Integer>> list) {
		
		
		list.add(new ArrayList<>(temp));
		for(int i=0; i<arr.length; i++)
		{
			temp.add(arr[i]);
			userRespect(arr,i+1,temp,list);
			temp.remove(temp.size()-1);
		}
	}

}
