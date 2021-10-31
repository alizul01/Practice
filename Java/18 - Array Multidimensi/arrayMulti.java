import java.util.Arrays;

public class arrayMulti {
    public static void main(String[] args) {
        System.out.println("Array multidimensi");

        // array 2 dimensi

        int [] array_1D = {1, 2, 3, 4, 5, 6};
        int [][] array_2D = {
            {1, 2, 3, 4, 5, 6}, 
            {7, 8, 9, 10, 11, 12}
        };

        printArray2D(array_2D);
        System.out.println(array_2D[1]);
    }

    private static void printArray2D(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
