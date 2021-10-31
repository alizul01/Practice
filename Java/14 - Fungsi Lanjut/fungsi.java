import java.util.Scanner;

public class fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, hasil;

        System.out.print("Masukkan panjang : "); panjang = sc.nextInt();
        System.out.print("Masukkan lebar : "); lebar = sc.nextInt();
        gambar(panjang, lebar);

        tampilkan(panjang, lebar);
        

    } // fungsi main

    public static void tampilkan(int panjang, int lebar) {
        System.out.println("luas = " + luas(panjang, lebar));
        System.out.println("keliling = " + keliling(panjang, lebar));
    }

    public static void gambar(int panjang, int lebar) { // awal fungsi gambar
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    } // akhir fungsi gambar

    public static int luas(int panjang, int lebar) { // awal fungsi luas
        int hasil = panjang * lebar;
        return hasil;
    } // akhir fungsi luas

    public static int keliling(int panjang, int lebar) { // awal fungsi keliling
        int hasil = (panjang + lebar) * 2;
        return hasil;

    } // akhir fungsi keliling

} // class
