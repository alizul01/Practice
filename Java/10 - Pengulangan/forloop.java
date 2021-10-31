import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        // Program for
        Scanner sc = new Scanner(System.in);

        int n, m;
        System.out.print("Masukkan nilai n = "); n = sc.nextInt();
        System.out.print("Masukkan nilai m = "); m = sc.nextInt();
        for (int i = 1; i < n; i++) {
             for (int j = 1; j <= m; j++) {
                System.out.print(i * j);
             }
            System.out.println(" ");
        }
    }
}
