import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class trial {

	public static void main(String[] args) {
//		String s = "110";
//		for(int i=1; i<s.length(); i++){
//			char s1 = s.charAt(i);
//			char s2 = s.charAt(i-1);
//            if(s1==1 && s2==1){
//                System.out.println("true");
//            }
//        }
//        System.out.println("false");

		// System.out.println(happy(9));
		// System.out.println(fibonacci(10));
//		int[] arr = {1,2,3,4,5,6,7};
//		reverseArray(arr);
//		for(int val : arr) {
//			System.out.print(val+" ");
//		}

		 occurence( " hitesh goyal ");
		 //alternatePrime(30);

//		int j=1;
//		int k=0;
//		for(int i=0; i<5; i++) {
//			k = j++ + ++j;
//			System.out.print(k+" ");
//		}

//		int[] arr = { -20, 4, 57, 45, 76, 1, -3, 0, 1 };
//		quickSort(arr, 0, arr.length - 1);
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}

		//int[][] myarray = { { 5, 10 } };
//		int[] arr = {1,1,0,1,1,1};
//		System.out.println(consecutiveOnes(arr));
		
//		int[] arr = {88,77,66,55,44,33,22,11,-1};
//		insertionSort(arr);
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
//		
//		trailingZeroes(5);
		
		//loveLetter("nitin hitesh hello adaada",3);
//		int[] arr = {3, 3, 4, 2, 4, 4, 4, 4};
//		System.out.println(majority(arr));
//		
		
	}

	public static boolean happy(int n) {
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		int digit;
		while (true) {

			while (n != 0) {
				digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}

			if (sum == 1) {
				return true;
			} else if (set.contains(sum)) {
				return false;
			} else {
				set.add(sum);
				n = sum;
			}
		}
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int sum = fnm1 + fnm2;

		return sum;
	}

	public static void reverseArray(int[] arr) {

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}

	public static void occurence(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		str = str.replaceAll(" ", "");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (char c : map.keySet()) {
			System.out.println(c + " " + map.get(c));
		}
	}

	public static void secondLargest(int[] arr) {
		int max = arr[0];
		int smax = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			}

			if (arr[i] > smax && arr[i] != max) {
				smax = arr[i];
			}
		}
		if (smax == Integer.MIN_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(smax);
		}
	}

	public static void alternatePrime(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);

		for (int table = 2; table * table <= n; table++) {

			if (prime[table] == false) {
				continue;
			}

			for (int mult = 2; mult * table <= n; mult++) {
				prime[table * mult] = false;
			}
		}

		boolean flag = false;
		for (int i = 2; i <= n; i++) {

			if (prime[i]) {
				flag = !flag;
			}

			if (prime[i] && flag) {
				System.out.print(i + " ");
			}
		}
	}

	public static int[] mergeTwoSorted(int[] one, int[] two) {
		int[] merged = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			merged[k] = one[i];
			i++;
			k++;
		}

		while (j < two.length) {
			merged[k] = two[j];
			j++;
			k++;
		}

		return merged;
	}

	public static int[] mergeSort(int[] arr, int low, int high) {

		if (low == high) {
			int[] ba = new int[1];
			ba[0] = arr[low];
			return ba;
		}

		int mid = (low + high) / 2;

		int[] sp1 = mergeSort(arr, low, mid);
		int[] sp2 = mergeSort(arr, mid + 1, high);
		int[] sorted = mergeTwoSorted(sp1, sp2);

		return sorted;
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;
		int pivot = arr[mid];
		int left = low;
		int right = high;

		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		quickSort(arr, low, right);
		quickSort(arr, left, high);

	}

	public static int consecutiveOnes(int[] nums) {

		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 1) {
				count++;
				while (i < nums.length-1 && nums[i] == nums[i + 1]) {
					i++;
					count++;
				}
			}

			if (count > max) {
				max = count;
				count = 0;
			}
		}

		return max;
	}
	
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}else {
					break;
				}
			}
		}

	}
	

	public static void trailingZeroes(int n) {
		if(n<0) {
			System.out.println("-1");
		}
		
		int count = 0;
		for(int i=5; n/i>=1; i*=5) {
			count += n/i;
		}
		
		System.out.println(count);
	}
	
	
	public static void loveLetter(String s, int rotate) {
		s = s.toLowerCase();
		String[] arr = s.split(" ");
		int count = 0;
		
		for(String str : arr) {
			int n = rotate;
			n = n%str.length();
			
			String s1 = str.substring(str.length()-n)+str.substring(0,str.length()-n);
			System.out.println(s1);
			if(s1.equals(str)) {
				count++;
			}
		}
		
		System.out.println(count);
	} 
	
	
	public static int majority(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
				
				if(map.get(arr[i])>arr.length/2) {
					return arr[i];
				}
			
			}else {
				map.put(arr[i], 1);
			}
		}
		
		return -1;
	}
	
	
	public static String javaToC(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				return modifyJava(str);
			}else if(str.charAt(i)=='_') {
				return modifyC(str);
			}
		}
		
		return "";
	}
	
	public static String modifyC(String str) {
		
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='_') {
				i++;
				sb.append(Character.toUpperCase(ch[i]));
			}else {
				sb.append(ch[i]);
			}
		}
		
		return sb.toString();
	}
	
	public static String modifyJava(String str) {
		
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				sb.append("_");
				sb.append(ch[i]);
			}else {
				sb.append(ch[i]);
			}
		}
		
		return sb.toString().toLowerCase();
	}
	
	
	

	
	
	

}
