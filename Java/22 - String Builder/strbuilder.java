import java.lang.StringBuilder;

public class strbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Halo");
        printData(builder);

        // append
        builder.append(" semuanya!");
        printData(builder);

        builder.append(" Warga malang!");
        printData(builder);

        // insert
        builder.insert(20, " Kota");
        printData(builder);

        // delete
        builder.delete(19, 24);
        printData(builder);

        // ubah char pada index tertentu
        builder.setCharAt(8, 'w');
        printData(builder);
        
        // mencari index
        System.out.println(builder.indexOf("malang"));

        // replace
        builder.replace(21, 27, "Bandung");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
    }

    private static void printData(StringBuilder data) {
        System.out.println("Data : " + data);
        System.out.println("Panjang Data : " + data.length());
        System.out.println("Kapasitas Data : " + data.capacity());

        int address = System.identityHashCode(data);
        System.out.println(Integer.toHexString(address));
    }
}
