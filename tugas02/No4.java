//class dan nama file
public class No4 {
  // main function
  public static void main(String[] args) {
    // mendeklarasikan variabel
    int hasil;
    System.out.println("++=================================++");
    System.out.println("Daftar bilangan genap dari 1 sampe 20");
    // perulangan
    for (int i = 0; i < 21; i++) {
      hasil = i;
      hasil %= 2; // modulus

      // pengecekan apakah bilangan genap atau tidak
      if (hasil == 0) {
        // mencetak hasil
        System.out.print(i + " ");
      }
    }
    System.out.println();
    System.out.println("++=================================++");
  }
}
//https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas02