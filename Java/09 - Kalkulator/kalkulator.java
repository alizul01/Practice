import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        // a operator b
        Scanner sc = new Scanner (System.in);

        double a, b, hasil;
        char operator; // Karena operator hanya 1 char saja

        System.out.print("Masukkan nilai a = "); a = sc.nextDouble();
        System.out.print("Masukkan operator = "); operator = sc.next().charAt(0);
        System.out.print("Masukkan nilai b = "); b = sc.nextDouble();

        System.out.println("Input user : " + a + " " + operator + " " + b);

        // Operator tersedia * / + -
        if (operator == '+') {
            // Penjumlahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        }
        else if (operator == '-') {
            // Pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        }
        else if (operator == '*') {
            // Perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        }
        else if (operator == '/') {
            // Pembagian
            if (b == 0) {
                System.out.println("Error, can't divide by zero");
                return;
            }
            else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
            
        }
        else {
            // Error, operator not found!
            System.out.println("Error, operator not found!");
            return;
        }
    }
}