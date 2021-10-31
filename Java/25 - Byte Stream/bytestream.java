import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka file

        fileInput = new FileInputStream("input.txt");

        // Membaca file
        int data = fileInput.read();
        while (data != -1) {
            System.out.print((char)data);
            data = fileInput.read();
        } 

        // menutup file
        fileInput.close();

        try {

            // membuka file
            fileInput = new FileInputStream("input.txt");
            fileOutput = new FileOutputStream("output.txt");
            
            // membaca file dengan tipe data byte
            int buffer = fileInput.read();

            while (buffer != -1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

        } catch (Exception e) {
            System.err.println("Maaf, File Error!");
        } 
        System.out.println();
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output2.txt")
        ) {
             // Membaca file
             int baca = in.read();
             
             while (baca != -1) {
                 out.write((char) baca);
                 baca = in.read();
             }
        }
    }
}