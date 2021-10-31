import java.util.Scanner;

public class kalkulatorSwitch {
    public static void main (String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        // Deklarasi Variable
        double a, b, hasil;
        String operator;
        // Input user
        System.out.print("Nilai a = "); a = sc.nextDouble();
        System.out.print("Operator = "); operator = sc.next();
        System.out.print("Nilai b = "); b = sc.nextDouble();

        switch(operator) {
            case "+":
                // Penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                // Penjumlahan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                // Penjumlahan
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                // Penjumlahan
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            case "**":
                // Pangkat
                hasil = Math.pow(a, b);
                System.out.println("Hasil = " + hasil);
                break;
            default:
            System.out.println("Error, operator " + operator + " Not Found");
        }

    }

}
