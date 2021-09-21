import java.util.Scanner;

public class No32 {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int[][] matriks = new int[2][2];
    int jumlah = 1;

    System.out.print("Masukkan nilai kolom pertama dan baris pertama    : ");
    matriks[0][0] = Input.nextInt();

    System.out.print("Masukkan nilai kolom kedua dan baris pertama      : ");
    matriks[0][1] = Input.nextInt();

    System.out.print("Masukkan nilai kolom pertama dan baris kedua      : ");
    matriks[1][0] = Input.nextInt();

    System.out.print("Masukkan nilai kolom kedua dan baris kedua        : ");
    matriks[1][1] = Input.nextInt();

    System.out.println("================= Matriks =========================");
    System.out.println("[" + matriks[0][0] + " " + matriks[0][1] + "]");
    System.out.println("[" + matriks[1][0] + " " + matriks[1][1] + "]");
    System.out.println("================= Matriks =========================");

    for (int i = 0; i < matriks.length; i++) {
      for (int j = 0; j < matriks.length; j++) {
        jumlah *= matriks[i][j];
      }
    }
    System.out.println("Hasil Perkalian dari sebuah matrik tersebut adalah : " + jumlah);
  }

}
//https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas03