import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("a = "); int a = sc.nextInt();
       
        switch (a) {
            case 10:
                System.out.println("a = 10");
                break;
            default:
                System.out.println("Error");
        }
        System.out.println("Program Selesai");
    }
}
