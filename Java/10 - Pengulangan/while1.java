import java.util.*;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ini adalah awal program");
        
        int a;
        System.out.print("Masukkan a = "); a = sc.nextInt();
        while (a >= 0) {
            System.out.println("While loop"); 
            a++;
            if (a == 9) {
                break;
            }
        }
    }
}