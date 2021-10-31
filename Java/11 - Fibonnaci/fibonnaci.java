import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int awal = 0, sekarang = 1, batas, jumlah = 0;
        System.out.print("Masukkan batas pengulangan = "); batas = sc.nextInt();
        /* for (int i = 0; i <= batas; i++) {
           if (batas >= awal) {
            jumlah = awal + sekarang;
            System.out.print(jumlah + " ");
            awal = sekarang;
            sekarang = jumlah;
           }
           else {
               System.out.println(" ");
               System.out.println("Program berhenti");
                break;
           }
        } */
        while (batas > 0) {
            jumlah = awal + sekarang;
            System.out.print(jumlah + " ");
            awal = sekarang;
            sekarang = jumlah;
            batas--;
        }
    }
}