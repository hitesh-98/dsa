package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class pairOfRoses {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int test = scn.nextInt();

		for (int i = 1; i <= test; i++) {
			int[] arr = takeInput();
			int target = scn.nextInt();
			rosesPair(arr, target);

		}

	}

	public static int[] takeInput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		return arr;
	}

	public static void rosesPair(int[] arr, int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		int i = 0;
		int j = 0;
		while (start < end) {
			if (arr[start] + arr[end] < target)
				start++;
			else if (arr[start] + arr[end] > target)
				end--;
			else {
				i = arr[start];
				j = arr[end];
				start++;
				end--;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + i + " " + "and" + " " + j + ".");

	}

}
