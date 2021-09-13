//import input
import java.util.Scanner; 

//class and file name
public class No1 {

  // function untuk menu
  static void Menu(){
    System.out.println("++==========================================++");
    System.out.println("||          KALKULATOR SEDERHANA            ||");
    System.out.println("||==========================================||");
    System.out.println("||            1. Penjumlahan                ||");
    System.out.println("||            2. Pengurangan                ||");
    System.out.println("||            3. Perkalian                  ||");
    System.out.println("||            4. Pembagian                  ||");
    System.out.println("||            5. Modulus                    ||");
    System.out.println("||            6. Keluar                     ||");
    System.out.println("++==========================================++");
  }
  // main function
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    //deklarasi variabel
    int Num1, Num2, Pilihan, Hasil;
    double Hasil1;

    //manggil function menu
    Menu();

    //meminta input user
    System.out.print("Masukkan pilihan anda (angka) : ");
    Pilihan = Input.nextInt();

    //mengecek inputan user
    if (Pilihan == 1) { 
      //==================================== KASUS 01 =====================================
      System.out.println("++==========================================++"); 
      System.out.println("||                PENJUMLAHAN               ||"); 
      System.out.println("++==========================================++"); 
      
      System.out.print("Masukkan bilangan pertama : ");   //meminta inputan untuk angka 1
      Num1 = Input.nextInt();

      System.out.print("Masukkan bilangan kedua : ");     //meminta inputan untuk angka 2
      Num2 = Input.nextInt();
      Hasil = Num1 + Num2;                                // melakukan penjumlahan

      System.out.println("Hasil Penjumlahan : "+ Hasil);  //mencetak hasil
      System.out.println("++==========================================++");
      //==================================== KASUS 01 =====================================
    }else if (Pilihan == 2) {
      //==================================== KASUS 02 =====================================
      System.out.println("++==========================================++");
      System.out.println("||                PENGURANGAN               ||"); 
      System.out.println("++==========================================++");
      
      System.out.print("Masukkan bilangan pertama : ");   //meminta inputan untuk angka 1
      Num1 = Input.nextInt();

      System.out.print("Masukkan bilangan kedua : ");     //meminta inputan untuk angka 2
      Num2 = Input.nextInt();
      Hasil = Num1 - Num2;                                // melakukan pengurangan

      System.out.println("Hasil Penjumlahan : "+ Hasil);  //mencetak hasil
      System.out.println("++==========================================++");
      //==================================== KASUS 02 =====================================
    }else if (Pilihan == 3) {
      //==================================== KASUS 03 =====================================
      System.out.println("++==========================================++");
      System.out.println("||                 PERKALIAN                ||"); 
      System.out.println("++==========================================++");
      
      System.out.print("Masukkan bilangan pertama : ");   //meminta inputan untuk angka 1
      Num1 = Input.nextInt();

      System.out.print("Masukkan bilangan kedua : ");     //meminta inputan untuk angka 2
      Num2 = Input.nextInt();
      Hasil = Num1 * Num2;                                // melakukan perkalian

      System.out.println("Hasil Penjumlahan : "+ Hasil);  //mencetak hasil
      System.out.println("++==========================================++");
      //==================================== KASUS 03 =====================================
    }else if (Pilihan == 4) {
      //==================================== KASUS 04 =====================================
      System.out.println("++==========================================++");
      System.out.println("||                 PEMBAGIAN                ||"); 
      System.out.println("++==========================================++");
      
      System.out.print("Masukkan bilangan pertama : ");    //meminta inputan untuk angka 1
      Num1 = Input.nextInt();

      System.out.print("Masukkan bilangan kedua : ");      //meminta inputan untuk angka 2
      Num2 = Input.nextInt();                         
      Hasil1 = Double.valueOf(Num1) / Double.valueOf(Num2);// melakukan pembagian

      System.out.println("Hasil Penjumlahan : "+ Hasil1);  //mencetak hasil
      System.out.println("++==========================================++");
      //==================================== KASUS 04 =====================================
    }else if (Pilihan == 5) {
      //==================================== KASUS 05 =====================================
      System.out.println("++==========================================++");
      System.out.println("||                  MODULUS                 ||"); 
      System.out.println("++==========================================++");
      
      System.out.print("Masukkan bilangan pertama : ");   //meminta inputan untuk angka 1
      Num1 = Input.nextInt();

      System.out.print("Masukkan bilangan kedua : ");     //meminta inputan untuk angka 2
      Num2 = Input.nextInt();
      Hasil = Num1 % Num2;                                // melakukan modulus

      System.out.println("Hasil Penjumlahan : "+ Hasil);  //mencetak hasil
      System.out.println("++==========================================++");
      //==================================== KASUS 05 =====================================
    }else if (Pilihan == 6) {
      //==================================== KASUS 06 =====================================
      System.out.println("++==========================================++");
      System.out.println("||                  KELUAR                  ||"); 
      System.out.println("++==========================================++");
      //==================================== KASUS 06 =====================================
    } else {
      //==================================== KASUS 07 =====================================
      System.out.println("++==========================================++");
      System.out.println("||        PILIHAN ANDA TIDAK TERSEDIA       ||"); 
      System.out.println("++==========================================++");
      //==================================== KASUS 07 =====================================
    }

  }

}

//https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas02