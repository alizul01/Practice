/**
 * Project ini untuk melakukan read file: input.txt per baris menggunakan
 * String Tokenizer. Ini akan sangat terpakai sekali dalam pengolahan data
 * yang memiliki baris berbeda. 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * belajarScanner
 */
public class belajarScanner {

    public static void main(String[] args) throws IOException {
        /**
         * FileReader untuk membaca file, BufferedReader untuk melakukan penyimpanan di memory supaya lebih efektif
         */
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferRead = new BufferedReader(fileInput);
        /**
         * hasNext merupakan Boolean untuk mengecek file apakah terdapat suatu text atau tidak. 
         */
        Scanner sc = new Scanner(bufferRead);
        System.out.println(sc.hasNext()); 
        // untuk membaca per kata
        Boolean i = sc.hasNext();
        try {
            while(i) {
                System.out.println(sc.next());
            }
        } catch (Exception e) {
           System.err.println("Error euyyy");
        }
        System.out.println("tes");

        // untuk membaca data yang memiliki delimeter tertentu "," atau "." dll
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferRead = new BufferedReader(fileInput2);
        bufferRead.mark(200);

        sc = new Scanner(bufferRead);
        sc.useDelimiter(",");
        System.out.println(sc.hasNext());
        while(sc.hasNext()) {
            System.out.print(sc.next() + " ");
        }
        
        // menggunakan string tokenizer supaya tidak membaca baris selanjutnya jika diperlukan
        bufferRead.reset();
        String data = bufferRead.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data, ",");
        while(stringToken.hasMoreTokens()) {
            System.out.print(stringToken.nextToken() + " ");
        }
        sc.close();
    }
}