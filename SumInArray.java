package corejava.arrays;

public class SumInArray {
	float[] arr = {12.33f,11.23f,21.211f,13.33f};
	float sum=0.0f;
	public float sum() {
		for(float f:arr) {
			sum+=f;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(new SumInArray().sum());
	}

}
