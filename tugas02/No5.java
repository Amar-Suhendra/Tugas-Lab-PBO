//class dan nama file
public class No5 {
    // main function
    public static void main(String[] args) {
      // mendeklarasikan variabel
      int hasil,hasil2;
      System.out.println("++========================================================++");
      System.out.println("Daftar bilangan genap dari 1 sampe 20 kecuali kelipatan 6");
      // perulangan
      for (int i = 0; i < 21; i++) {
        hasil = i % 2; // modulus
        hasil2 = i % 6;  
        // pengecekan apakah bilangan genap atau tidak dan mengecek apakah kelipatan 6
        if (hasil == 0 && hasil2 != 0) {
          // mencetak hasil
          System.out.print(i + " ");
        }
      }
      System.out.println();
      System.out.println("++========================================================++");
    }
  }
  //https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas02