package Sorting;

import java.util.HashMap;

public class bubbleSort {

	public static void main(String[] args) {
//		int[] arr = {88,77,66,55,44,33,22,11};
//		bubble(arr);
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}

//		String arr1 = "205050505050522222";
//		occ(arr1);
		
		int[] from = {1,7,3,4,2,6,9};
		int[] to = {3,3,4,6,6,9,5};
		System.out.println(find(2,to,from));

	}

	// place largest element at its correct position in one pass

	// TC
	// best - O(n) when array is already sorted , n comparison, 0 swaps
	// average - O(n square)
	// worst - O(n square) when array is in decreasing order , n^2 comparison, n^2
	// swaps

	public static void bubble(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			boolean swap = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swap = false;
				}
			}

			if (swap) {
				break;
			}
		}
	}

	public static void occurence(String arr) {
		int maxEl = arr.charAt(0);
		int max = 0;
		int countEl = 0;
		int count = 0;

		for (int i = 0; i < arr.length(); i++) {

			char ch = arr.charAt(i);
			if (ch >= '0' && ch <= '9') {

				countEl = ch;
				count = 0;
				for (int j = 0; j < arr.length(); j++) {

					if (ch == arr.charAt(j)) {
						count++;
					}

					if (count > max) {
						max = count;
						maxEl = countEl;
					}
				}
			} else {
				maxEl = -1;
				break;
			}

		}

		if(maxEl==-1) {
			System.out.println("-1");
		}else {
			System.out.println((char)maxEl);
		}

	}
	
	public static void occ(String s) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		int max = 0;
		int maxChar = 0;
		for(char key : map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				maxChar = key;
			}

		}
		
		System.out.println((char)maxChar);

 
	}
	
	public static int find(int start, int[] to, int[] from) {
		
		int dest = 0;
		int ans = 0;
		for(int i=0; i<from.length; i++) {
			if(start==from[i]) {
				dest = to[i];
				System.out.println(dest);
				
				ans = find(dest,to,from);
			}
		}
		
		return ans;

	}


}
