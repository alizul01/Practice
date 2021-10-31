public class faktorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    } // main

    public static int factorial(int x) {
        if (x <= 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

}