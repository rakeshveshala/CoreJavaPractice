package corejava.arrays;
import java.util.Arrays;

public class CheckEqualityOfArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 4, 3, 2, 1};
        
        int[][] array4= {{1, 2, 3, 4, 5},{5, 4, 3, 2, 1}};
        int[][] array5= {{1, 2, 3, 4, 5},{5, 4, 3, 2, 1}};
        int[][] array6= {{11, 22, 33, 42, 5},{5, 4, 3, 2, 1}};

        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("Array1 equals Array2: " + isEqual);

        isEqual = Arrays.equals(array1, array3);
        System.out.println("Array1 equals Array3: " + isEqual);
        
        boolean isEqual1 = Arrays.deepEquals(array4, array5);
        System.out.println("Array4 equals Array5: " + isEqual1);

        isEqual1 = Arrays.equals(array4, array6);
        System.out.println("Array4 equals Array6: " + isEqual1);
    }
}