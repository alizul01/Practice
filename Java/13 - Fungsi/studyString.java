public class studyString {
    public static void main(String[] args) {
        System.out.println("hola!");

        // y = (x + 2) * x

        int y, x;
        x = 10;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }

    private static int hitung(int input) {
        int hasil;
        hasil = input * input;
        return hasil;
    }
}
