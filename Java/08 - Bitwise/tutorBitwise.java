public class tutorBitwise {
    public static void main(String[] args) {
        byte a = 0;
        String a_bits;

        a_bits = String.format("%s",Integer.toBinaryString(a));
        System.out.printf("%s = %d",a_bits, a);
    }
}