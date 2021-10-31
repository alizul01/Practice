import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * iostream
 */

public class iostream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            FileInputStream fileInput = new FileInputStream("input.txt");
            for (int i = 0; i < 6;i++) {
                System.out.print((char)fileInput.read());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}