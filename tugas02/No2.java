//import
import java.util.Scanner;

//class dan nama file
public class No2 {
  //main function
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    //deklarasi variabel
    int Nilai;

    //header
    System.out.println("++=================================++");
    System.out.println("|| APLIKASI PENGECEKAN NILAI HURUF ||");
    System.out.println("++=================================++");
    
    //meminta inputan
    System.out.print("Masukkan nilai anda : ");
    Nilai = Input.nextInt();

    if (Nilai >= 87) {
      //================== kasus 01 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       A        ||       4.00    ||");
      System.out.println("++================++===============++");
    }else if (78 <= Nilai && Nilai < 87) {
      //================== kasus 03 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       AB       ||       4.50    ||");
      System.out.println("++================++===============++");
    }else if(69 <= Nilai && Nilai < 78) {
      //================== kasus 03 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       B        ||       3.00    ||");
      System.out.println("++================++===============++");
    }else if(60 <= Nilai && Nilai < 69){
      //================== kasus 04 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       BC       ||       2.50    ||");
      System.out.println("++================++===============++");
    }else if(51 <= Nilai && Nilai < 60){
      //================== kasus 05 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       C        ||       2.00    ||");
      System.out.println("++================++===============++");
    }else if(41 <= Nilai && Nilai < 51){
      //================== kasus 06 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       D        ||       1.00    ||");
      System.out.println("++================++===============++");
    }else if(Nilai < 41){
      //================== kasus 07 ==============================
      System.out.println("++================++===============++");
      System.out.println("||   NILAI HURUF  ||        IP     ||");
      System.out.println("++================++===============++");
      System.out.println("||       E        ||       0.00    ||");
      System.out.println("++================++===============++");
    }
  }
}
//https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas02