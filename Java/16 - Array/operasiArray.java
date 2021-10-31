import java.util.*;

public class operasiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrayAngka1 = {1,2,3,4,5};

        // mengubah array ke string
        System.out.println("==============================\nMengubah array menjadi string \n==============================");
        printArray(arrayAngka1);

        // mengcopy array
        System.out.println("==============================\n \tMencopy array \n==============================");
        int [] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        // mengcopy array dengan copyOf
        System.out.println("==============================\n \t CopyOf array \n==============================");
        int [] arrayAngka3 = Arrays.copyOf(arrayAngka1, arrayAngka1.length);
        printArray(arrayAngka3);

        // CopyofRange
        System.out.println("==============================\n \tCopyOfRange \n==============================");
        int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3, arrayAngka1.length);
        printArray(arrayAngka4);

        // fill Array
        System.out.println("==============================\n \tFill array \n==============================");
        int [] arrayAngka5 = new int[arrayAngka1.length];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);

        
        // komparasi Array
        System.out.println("==============================\n \tCompare array \n==============================");
        int [] arrayAngka6 = {1, 2, 3, 4, 5};
        int [] arrayAngka7 = {1, 3, 4, 4, 5};
        // untuk check apakah kedua array ini sama atau tidak
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        // untuk check di index ke berapa dua array ini berbeda?
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
        
        // sort array
        System.out.println("==============================\n \t Sort array \n==============================");
        int [] arrayAngka8 = {5, 3, 5, 7, 9, 10, 12, 58, 923, 12, 23, 41, 2, 1};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search array berdasarkan index
        System.out.println("==============================\n \t search array \n==============================");
        int angka;
        System.out.print("Masukkan sebuah angka untuk dicari = "); angka = sc.nextInt();
        if ((Arrays.binarySearch(arrayAngka8, angka)) < 0) {
            System.out.println("Tidak terdapat angka " + angka + " di dalam arrayAngka8");
        } else {
            System.out.println("Angka " + angka + " terdapat di dalam index-" + Arrays.binarySearch(arrayAngka8, angka));
        }
        int [] angkaReverse = {23, 12, 123, 43, 39, 2, 44, 13};
        reverse(angkaReverse);

    }

    private static void printArray(int[] dataArray) {
        System.out.println("array = " + Arrays.toString(dataArray));
    }

    private static void reverse(int[] rev) {
        for (int i = 0; i < rev.length; i++) {
            rev[i] *= -1;
        }
        Arrays.sort(rev);
        for (int i = 0; i < rev.length; i++) {
            rev[i] *= -1;
        }
        printArray(rev);
    }
}