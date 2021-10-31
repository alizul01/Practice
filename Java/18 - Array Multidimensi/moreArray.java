import java.util.Arrays;

public class moreArray {
    public static void main(String[] args) {
        int [] arrayAngka1 = {1, 2, 3, 4, 5};
        int [] arrayAngka2 = new int [5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

    
    } // main

    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }
}
