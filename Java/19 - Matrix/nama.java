import java.util.*;

public class nama {
    public static void main(String[] args) {
        String[][] kelas = {
            {"Ali", "TI-1D"},
            {"Mira", "TI-1D"},
            {"Hekal", "TI-1D"}
        };

        for (int i = 0; i < kelas.length; i++) {
            System.out.println("Nama\t: " + kelas[i][0] + "\tKelas\t: " + kelas[i][1]);
        }
    }
}
