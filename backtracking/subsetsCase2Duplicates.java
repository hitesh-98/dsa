package backtracking;

import java.util.ArrayList;
import java.util.List;

public class subsetsCase2Duplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> list = new ArrayList<>();
		userRespect(arr,0, new ArrayList<>(),list);
 		System.out.println(list);

	}
	
	public static void userRespect(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> list) {
		
	}

}
