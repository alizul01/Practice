import java.util.Scanner;

public class latloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int awal, akhir, total = 0;

        System.out.print("Masukkan nilai awal = "); awal = sc.nextInt();
        System.out.print("Masukkan nilai akhir = "); akhir = sc.nextInt();

        // Algorithm Do While

        while (awal <= akhir) {
            total += awal;
            System.out.println((total - awal) + " Ditambah " + awal + " Menjadi " + total);
            awal++;
            
        }
        
        // Algorithm for loop
        for (; awal <= akhir; awal++){
            total += awal;
            System.out.println((total - awal) + " Ditambah " + awal + " Menjadi " + total);
        }

        // Algorithm do while
        do {
            total += awal;
            System.out.println(total);
            awal++;
        } while(awal <= akhir);
    }
}