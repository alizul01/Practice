import java.util.Scanner;
import java.lang.String;

public class stringOperasi {
    public static void main(String[] args) {
        String kalimat = "Saya suka dia!";

        // Mengambil komponen dari suatu String menggunakan charAt.
        System.out.println(kalimat.charAt(6));

        // SubString
        String kata = kalimat.substring(0, 10);
        System.out.println(kata);

        // Concatenation (concat)
        String kalimat2 = kata + "Bakwan ";
        System.out.println(kalimat2);

        // concat dengan non-String
        int jumlah = 3000;
        System.out.println(kalimat2 + jumlah);

        /* 
        Sebenernya Print itu cuma bisa buat string, jadi semua tipe data itu
        udah dicasting dulu baru bisa diprint secara "Internal" gitu.
        */

        // lowercase dan Uppercase
        System.out.println(kalimat2.toUpperCase());
        System.out.println(kalimat2.toLowerCase());

        // replace
        String kalimat3 = kalimat.replace("dia", "gedang");
        System.out.println(kalimat3);

        // Compare melihat yang lebih besar.
        System.out.println(kalimat2.compareToIgnoreCase(kalimat3));
        // Equality (Persamaan)
        String kataInput = "test"; // Ini akan diletakkan di dalam string pull
        String kataTest = "test"; // Ini juga ada di string pull

        if (kataInput.equals(kataTest)) {
            System.out.println("Sama!");
        } else {
            System.out.println("Tidak sama!");
        }

        String kataTes = new String("test");
        if (kataInput.equals(kataTes)) {
            System.out.println("Sama!");
        } else {
            System.out.println("Tidak sama!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan persetujuan (y/n) :" ); String userInput = sc.next();
        if (userInput.equals(kataTes)) {
            System.out.println("Sama!");
        } else {
            System.out.println("Tidak sama!");
        }
    }
}
