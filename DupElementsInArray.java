package corejava.arrays;

import java.util.Arrays;

public class DupElementsInArray {
	static int[] arr1= {12,22,32,32,21,12};
	static int[] arr2=new int[20];
	static int k=0;
	public static void main(String[] args) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					arr2[k++]=arr1[i];
				}
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==0) {
				continue;
			}
			System.out.println(arr2[i]);
		}
	}

}
