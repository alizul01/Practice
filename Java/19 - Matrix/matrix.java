import java.util.*;

public class matrix {
    public static void main(String[] args) {
        int[][] matA = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] matB = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        int [][] matC = new int[matA.length][];
        printArray(matA);
    } // main

    private static void printArray(int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        System.out.println("Matrix A : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
