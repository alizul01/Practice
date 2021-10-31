import java.util.*;

public class rekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai\t\t: "); int nilai = sc.nextInt();
        System.out.println("Anda memasukkan nilai\t: " + nilai);

        printNilai(nilai);
        jumlahNilai(nilai);
    } // main

    private static int jumlahNilai(int nilai) {
        System.out.println(nilai);

        if (nilai == 0) {
            return nilai;
        }
        return nilai + jumlahNilai(nilai - 1);
    }

    public static void printNilai(int parameter) {
        System.out.println("nilai\t\t\t: " + parameter);
        
        if (parameter == 0) {
            return;
        }

        parameter--;
        printNilai(parameter);
    } // fungsi printNilai
} // class