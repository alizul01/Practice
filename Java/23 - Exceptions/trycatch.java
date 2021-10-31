import java.io.FileInputStream;
import java.util.*;

public class trycatch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};

        Scanner sc = new Scanner(System.in);
        // array handling
        System.out.print("nilai array ke : "); int index = sc.nextInt();
        try {
            System.out.printf("index ke-%d adalah %d\n", index, array[index]);            
        } catch (Exception e) {
            System.err.println("Array yang kamu masukkan tidak sesuai dengan jumlah array");
        }
        
        // file handling
        try {
            FileInputStream fileInput = new FileInputStream("input.txt");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            System.out.println("Menggokil");
        }
        System.out.println("akhir dari program");
        sc.close();
    }
}
