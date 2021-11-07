import java.util.*;

/**
 * belajarLagi
 */
public class belajarLagi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();

        String mahasiswa[][] = new String [jumlah][3];

        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("Data Mahasiswa ke-" + (i+1));

            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("Nama : ");
                } else if (j == 1) {
                    System.out.print("NIM : ");
                } else if (j == 2) {
                    System.out.print("IPK : ");
                }
                
                mahasiswa[i][j] = sc.next();
            }
        }
        System.out.println("Data Mahasiswa yang dimasukkan");
        System.out.println("==============================");
        System.out.println("NIM \t\t\t NAMA \t\t JURUSAN \t");

        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mahasiswa[i][j] +"\t\t");
            }
            System.out.println();
        }
    }
}