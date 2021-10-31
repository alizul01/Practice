import java.util.*;

public class stringIntro {
    public static void main(String[] args) {
        String kataString = "halo!";
        char[] kataChar = {'h', 'a', 'l', 'o'};

        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // untuk menampilkan char dalam string
        // String adalah kumpulan dari char dan dapat diakses menggunakan "chartAt();"
        System.out.println("Komponen pertama dari string = " + kataString.charAt(0));

        // Merubah komponen
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        /* Tidak dapat mengubah String, karena string di java itu immutable.
        Kenapa immutable supaya saat trading tidak error?
        */

        // Dapat mengubah komponen String secara tidak langsung
        System.out.print("c");
        System.out.println(kataString.substring(1, kataString.length()));

        String str_1 = "halo!";
        printAddress("str_1", str_1);

        printAddress("kataString: ", kataString);

        // Apabila ada String yang isinya sama, maka keduanya akan memiliki String Address 
        // di memory yang sama, yaitu di String Pull, reusable juga sih.


    }

    private static void printAddress(String messages,String data) {
        int address = System.identityHashCode(data);
        System.out.println(messages + " " + data + " " + address);
    }
}
