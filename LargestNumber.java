package corejava.arrays;

public class LargestNumber {
	static int[] arr= {1,22,32,45,35,21,57,55,33,46};
	static int largest=0;
	 public static int largest() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		System.out.println(largest());
	}

}
