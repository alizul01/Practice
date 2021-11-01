import java.io.*;

/**
 * charstream
 */
public class charstream {

    public static void main(String[] args) throws IOException {
        // Membuka file
        
        // byte stream -> FileInputStream
        FileInputStream byteFile = new FileInputStream("input.txt");
        // Character stream -> FileReader
        FileReader      charFile = new FileReader("input.txt");

        FileOutputStream fileOutput = new FileOutputStream("output.txt");
        FileWriter fileTulis = new FileWriter("writerChar.txt");
        // Membaca file

        int buffer = byteFile.read();

        while (buffer != -1) {
            fileOutput.write(buffer);
            buffer = byteFile.read();
        }

        int tulis = charFile.read();

        while (tulis != -1) {
            fileTulis.write(tulis);
            tulis = charFile.read();
        }
        // Menutup file
        fileOutput.close();
        fileTulis.close();
        charFile.close();
        byteFile.close();
    }
}