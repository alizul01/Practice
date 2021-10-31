public class unary {
    public static void main(String[] Args) {
        // Unary = suatu operasi yang dilakukan pada satu variable

        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d \n", angka, -angka);

        // Unary increment dan decrement
        int angka2 = 10;
        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        // Postfix dan prefix
        int a = 5;
        System.out.printf("nilai '++' Prefix akan menjadi = %d \n", ++a);
        int b = 5;
        System.out.printf("nilai '++' Postfix akan tetap %d \n", b++);

        // unary boolean ! untuk negasi
        boolean cakep = true;
        System.out.println("nilai boolean awal = " + cakep);
        System.out.println("Nilai boolean setelah unary = " + !cakep);
    }
}