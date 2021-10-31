import java.util.*;

public class methodexcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arrayData = {0,1,2,3};
        // exception main
        System.out.print("data ke-"); int indexInput = sc.nextInt();
        try {
            System.out.printf("data dari array ke-%d adalah %d", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        } 

        // exception pakai fungsi
        int data = ambilDataArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d", indexInput, data);
        int data2 = 0;
        // exception throws by method
        System.out.println("\n\nException throws by method");
        try {
            data2 = ambilDataArray2(arrayData, indexInput);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("\n\nAkhir dari program");
        sc.close();
    }

    private static int ambilDataArray2(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    // exception dalam fungsi
    private static int ambilDataArray(int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }

        return hasil;
    } // akhir fungsi 
}
