import java.util.*;

public class matrix {
    public static void main(String[] args) {
        int [][] matrix_a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] matrix_b = {
            {11,12,13},
            {14,15,16},
            {17,18,19}
        };

        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;
        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;

        int [][] matrix_c = new int [baris_a][kolom_a];
        
        print2D(matrix_a); System.out.println("");
        print2D(matrix_b); System.out.println("");

        matrix_c = tambahMatrix(matrix_a, matrix_b);
        print2D(matrix_c);  System.out.println("");

        int [][] matrix_d = new int[baris_a][kolom_b];

        // perkalian matrix
        matrix_d = productMatrix(matrix_a, matrix_b);
        print2D(matrix_d);
    }

    private static int[][] productMatrix(int [][] array_1, int[][] array_2) {
        int baris_a = array_1.length;
        int kolom_a = array_1[0].length;
        int baris_b = array_2.length;
        int kolom_b = array_2[0].length;

        int [][] hasil = new int[baris_a][kolom_b];

        int buffer;
        if (kolom_a == baris_b) {
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_b; j++) {
                    buffer = 0;
                    for (int k = 0; k < kolom_a; k++) {
                        buffer += array_1[i][k] * array_2[k][j];
                    }
                    hasil[i][j] = buffer;
                }
            }
        } else {
            System.out.println("Error: Matrix tidak memiliki baris dan kolom yang sama");
        }
        return hasil;
    }

    private static void print2D(int [][] array) {
        int baris = array.length;
        int kolom = array[0].length;
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                if (j < kolom - 1) 
                    System.out.print(array[i][j] + " ");
                else
                    System.out.print(array[i][j] + "]");
            }
            System.out.print("\n");
        }
    } // print2D

    private static int[][] tambahMatrix(int[][] matrix_1, int[][] matrix_2) {
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;
        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int [][] hasil = new int [baris_a][kolom_a];
        if (baris_a != baris_b || kolom_a != kolom_b) {
            System.out.println("Error: Baris atau kolom tidak sama");
        } else {
            for (int i = 0; i < baris_a; i++) {
                for (int j = 0; j < kolom_a; j++) {
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        }

        return hasil;
    }
}
