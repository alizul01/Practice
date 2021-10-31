public class Konverensi {
   public static void main (String[] args) {
       
      // Program untuk konversi data

      int nilaiInt = 450; 
      System.out.println("nilai int = " + nilaiInt);

      // Memerluas rentang tipe data ke yang lebih besar
      long nilaiLong = nilaiInt;
      System.out.println("nilai long = " + nilaiLong);

      // Memperkecil ke tipe data yang lebih kecil
      byte nilaiByte = (byte) nilaiInt;
      System.out.println("nilai byte = " + nilaiByte);

      // casting pembagian
      float a = 10;
      int b = 4;

      float c = a/b;

      System.out.printf("%1.1f / %d = %1.1f \n",a,b,c);
   } 
}
