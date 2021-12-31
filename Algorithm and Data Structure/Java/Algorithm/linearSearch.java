import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = {90, 96, 87, 70, 80, 85, 90, 100, 80, 90, 95, 100};
        System.out.print("Masukkan nilai yang dicari: ");
        int target = sc.nextInt();
        if (linearsearch(nilaiMhs, target) != -1) {
            System.out.println("Nilai " + target + " ditemukan pada indeks ke " + linearsearch(nilaiMhs, target));
        } else {
            System.out.println("Nilai " + target + " tidak ditemukan");
        }
    }

    public static int linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}