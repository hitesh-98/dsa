package arrays;
import java.util.*;
public class targetSumPair {
    static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) {
        int[] arr = takeInput();
        int target = scn.nextInt();
        targetSumPair(arr,target);
    }

    public static int[] takeInput() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        return arr;
    }

    public static void targetSumPair(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            if(arr[start]+arr[end] < target)
                start++;
            else if(arr[start]+arr[end] > target)
                end--;
            else{
                System.out.println(arr[start]+" "+"and"+" "+arr[end]);
                start++;
                end--;
            }
        }

    }
}