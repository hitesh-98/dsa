package DP;

public class boardPath {

	public static void main(String[] args) {
		int n = 10000;
		//System.out.println(boardPathRecursive(0, n));
		System.out.println(boardPathTopDown(0,n, new int[n]));
		System.out.println(boardPathBotomUp(n));
		System.out.println(boardPathBU_SE(n));

	}
	
	public static int boardPathRecursive(int curr, int end) {
		
		if(curr>end)
			return 0;
		
		if(curr==end)
			return 1;
		
		int count = 0; 
		for(int dice=1; dice<=6; dice++) {
			count += boardPathRecursive(curr+dice, end);
		}
		
		return count;
	}
	
	//TC: n   SC: n
	public static int boardPathTopDown(int curr, int end, int[] storage) {
		
		if(curr>end)
			return 0;
		
		if(curr==end)
			return 1;
		
		if(storage[curr]!=0)
			return storage[curr];    //re-use previously computed values
		
		int count = 0; 
		for(int dice=1; dice<=6; dice++) {
			count += boardPathTopDown(curr+dice, end, storage);
		}
		
		storage[curr] = count;   //store values
		return count;
	}
	
	//TC: n   SC: n
	public static int boardPathBotomUp(int end) {
		
		int[] storage = new int[end+6];
		
		storage[end] = 1;
		
		for(int i=end-1; i>=0; i--) {
			
			for(int j=1; j<=6; j++) {
				storage[i] += storage[i+j];
			}
		}
		
		return storage[0];

	}
	
	//TC: n   SC: 1
	public static int boardPathBU_SE(int end) {
		
		int[] storage = new int[6];
		storage[0] = 1;
		
		for(int slide=1; slide<=end;slide++){
			
			int sum = storage[0]+storage[1]+storage[2]+storage[3]+storage[4]+storage[5];
			
			storage[5] = storage[4];
			storage[4] = storage[3];
			storage[3] = storage[2];
			storage[2] = storage[1];
			storage[1] = storage[0];
			storage[0] = sum;
		}
		
		return storage[0];
	}
	
}
