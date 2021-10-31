import java.util.Arrays;

public class latihanArray {
    public static void main(String[] args) {
        // penjumlahan dua buah array
        int [] arrayAngka = {2, 3, 5, 6, 7, 8, 9, 10};
        printArray(arrayAngka, "Array Angka");
        
        int [] arrayAngka2 = {0, 4, 2, 5, 1, 8, 9, 3};
        printArray(arrayAngka2, "Array Angka 2");

        int[] arrayHasil = tambahArray(arrayAngka, arrayAngka2);
        printArray(arrayHasil, "Array setelah dijumlahankan");

        // menggabungkan dua buah array
        int [] arrayGabung = new int[arrayAngka.length + arrayAngka2.length];
        printArray(arrayGabung, "Array Gabung sekarang");
        for (int i = 0; i < arrayAngka.length; i++) {
            arrayGabung[i] += arrayAngka[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayGabung[i+arrayAngka.length] += arrayAngka2[i];
        }
        printArray(arrayGabung, "array setelah digabung");

        reverse(arrayAngka2);
        printArray(arrayAngka2, "arrayAngka2 setelah direverse");
    }

    private static void reverse(int[] arrayReverse) {
        int buffer;
        Arrays.sort(arrayReverse);

        for (int i = 0; i < arrayReverse.length/2; i++) {
            buffer = arrayReverse[i];
            arrayReverse[i] = arrayReverse[(arrayReverse.length - 1) - i];
            arrayReverse[(arrayReverse.length - 1) - i] = buffer;
        }
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int [] jumlahArray = new int [arrayInt1.length];
       
        for (int i = 0; i < arrayInt1.length; i++) {
            jumlahArray[i] = arrayInt1[i] + arrayInt2[i];
        }
        return jumlahArray;
    }

    private static void printArray(int[] dataArray, String message) {
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
}
