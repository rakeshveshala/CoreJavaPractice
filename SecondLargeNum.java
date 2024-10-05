package corejava.arrays;
import java.util.*;
public class SecondLargeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		int count=0;
		int[] arr = {12,11,2,4545,44,223,343,45};
		Arrays.sort(arr);
		int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
       System.out.println(Arrays.toString(arr));
	}

}
