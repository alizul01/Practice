import java.util.*;

public class studyVoid {
    public static void main(String[] args) {
        // void itu artinya hampa
        Scanner sc = new Scanner(System.in);
        String nama;
        System.out.print("Masukkan nama kamu : "); nama = sc.nextLine();
        /*
        double x = simple(20);
        System.out.println(x);
        fungsiVoid("Apapun dah");
        */
        selamatPagi(nama);
        
    }

    // method

    public static void selamatPagi(String nama) {
        System.out.println("Selamat pagi, " + nama);
    }

    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

    // fungsi atau method dengan kembalian 
    // menggunakan return untuk mengembalikan nilainya (10.0f)

    private static double simple (double nilai) {
        double hasil;
        hasil = nilai + nilai;
        return hasil;
    }
}