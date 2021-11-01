import java.io.*;

/**
 * bufferStream
 */
public class bufferStream {

    public static void main(String[] args) throws IOException{
        long waktuStart, waktuFinish;

        // Membaca file
        FileInputStream fileInput = new FileInputStream("input.txt");
        System.out.println(fileInput.available());

        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(fileInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        fileInput.close(); 

        // Membaca dari memory
        FileInputStream byteInput = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput);
        
        bufferedInput.mark(200);
        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

        // Menulis dengan buffered output

        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);
        
        // write data berupa byte
        bufferedOutput.write(data, 0, data.length);
        bufferedOutput.flush();
        // close
        bufferedInput.close();
        bufferedOutput.close();
    }
}