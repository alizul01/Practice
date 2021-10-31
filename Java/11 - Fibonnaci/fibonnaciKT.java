import java.util.Scanner;

public class fibonnaciKT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi
        int f_n = 0, f_n1, f_n2, n;
        System.out.print("Memasukkan nilai fibonnaci ke-"); n = sc.nextInt();
        f_n2 = 0;
        f_n1 = 1;
        // Algorithm
        for (int i = 1; i <= n; i++) {
            f_n = f_n1 + f_n2;
            System.out.println("nilai fibonnaci ke-" + i + " adalah " + f_n);
            f_n2 = f_n1;
            f_n1 = f_n;
        }
    }
}
