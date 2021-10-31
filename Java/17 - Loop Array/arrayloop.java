import java.util.*;

public class arrayloop {
    public static void main(String[] args) {
        int [] arrayAngka = {11, 12, 13, 14, 15};
        // loop standard
        for(int i = 0; i < 5; i++) {
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }

        // looping dengan properti dari array
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }

        // looping khusus untuk collection <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka) {
            if (angka %2 != 0) {
                continue;
            } 
            System.out.println(angka);       
        }
    }
}
