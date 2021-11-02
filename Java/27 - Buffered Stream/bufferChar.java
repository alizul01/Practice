import java.io.*;
import java.util.Arrays;

/**
 * bufferChar
 */
public class bufferChar {

    public static void main(String[] args) throws IOException {
        // Membaca File
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferReader = new BufferedReader(fileInput);
        bufferReader.mark(200);
        // Membaca ke dalam String
        String data = bufferReader.readLine();
        System.out.println(data);
        // Membaca ke dalam char
        bufferReader.reset();
        char[] dataChar = new char[25];
        bufferReader.read(dataChar, 0, 25);
        System.out.println(Arrays.toString(dataChar));

        // Membaca baris
        bufferReader.reset();
        System.out.println(bufferReader.readLine());
        System.out.println(bufferReader.readLine());

        // Menulis file
        bufferReader.reset();
        FileWriter fileOutput = new FileWriter("outputChar.txt");
        BufferedWriter bufferWrite = new BufferedWriter(fileOutput);

        String baris1 = bufferReader.readLine();
        bufferWrite.write(baris1, 0, baris1.length());
        bufferWrite.flush();

        // Menambah enter / new line
        bufferWrite.newLine();
        String baris2 = bufferReader.readLine();
        bufferWrite.write(baris2, 0, baris2.length());
        bufferWrite.flush();
        // Close
        bufferReader.close();
        bufferWrite.close();
        fileInput.close();
    }
}