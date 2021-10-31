public class ContohVariable {
    
    public static void main (String[] args) {
        String hoby = "Bermain petak umpet";
        boolean smart = true;
        char gender = 'L';
        byte age = 20;
        double ipk = 3.24, height= 1.78;
        System.out.println(hoby);
        System.out.println("Apakah pandai? " + smart);
        System.out.println("Jenis kelamin: " + gender);
        System.out.println("umurku saat ini: " + age);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, height));
    }
}
