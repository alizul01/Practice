import java.util.*;

public class rekursifcabang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan batas fibonnaci\t: "); n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonnaci(i) + " ");
        }
    } // main

    public static int fibonnaci(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        return fibonnaci(x - 1) + fibonnaci(x - 2);
    }
} // class