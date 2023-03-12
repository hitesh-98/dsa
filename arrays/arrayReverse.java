package arrays;
import java.util.Scanner;

public class arrayReverse {

	static Scanner scn  = new Scanner(System.in);
    public static void main(String args[]) {
        int[] arr = takeInput();
        int[] result = arrayReverse(arr);
        for(int i:result)
            System.out.println(i);

    }

    public static int[] takeInput() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scn.nextInt();

        return arr;
    }

    public static int[] arrayReverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int temp;
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return arr;
    }
}
