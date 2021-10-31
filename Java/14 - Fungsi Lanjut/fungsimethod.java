import java.util.*;

public class fungsimethod {
    public static void main(String[] args) {
        int hasilInteger;
        hasilInteger = tambah(4,5);

        float hasilFloat;

        hasilFloat = tambah(10.5f, 10);
        printAngka(hasilFloat);

    } // main

    private static float tambah(float angka1, int angka2){
        return angka1 + angka2;
    } // tambah

    private static int tambah(int angka1, int angka2){
        return angka1 + angka2;
    } // tambah

    // overload method
    private static void printAngka(float angkaF) {
        System.out.println("angka ini adalah float dengan nilai = " + angkaF);
    }

    private static void printAngka(int angka) {
        System.out.println("angka ini adalah integer dengan nilai = " + angka);
    } // print angka
} // class