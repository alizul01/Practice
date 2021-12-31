import java.time.LocalDate;

public class tes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear());
        System.out.println(date.plusDays(30).getDayOfMonth() + " " + date.plusDays(30).getMonth() + " " + date.plusDays(30).getYear());

        System.out.println(chairValidation("a1".toUpperCase()));
    }

    public static boolean chairValidation(String input) {

        if ((input.contains("A") || input.contains("B") || input.contains("C") || input.contains("D"))
                && (input.contains("1") || input.contains("2") || input.contains("3") || input.contains("4"))
                && input.length() == 2) {
            return true;
        } else {
            return false;
        }
    }
}
