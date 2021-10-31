import java.util.*;

public class multidimensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int n = sc.nextInt();

        String mahasiswa[][] = new String [n][3];

        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            System.out.println("Data Mahasiswa ke-" + (i+1));
            
            for (int j = 0; j < 3; j++) {
                if (j==0) 
                    System.out.print("NIM\t: ");
                else if (j == 1) 
                    System.out.print("Nama\t: ");
                else 
                    System.out.print("Jurusan\t: ");
                
                System.out.print("");
                mahasiswa[i][j] = sc.next();
            }
        }

        System.out.println("Data Mahasiswa yang dimasukkan");
        System.out.println("==============================");
        System.out.println("NIM \t\t\t NAMA \t\t JURUSAN \t");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mahasiswa[i][j] +"\t\t");
            }
            System.out.println();
        }
    } // main
}
