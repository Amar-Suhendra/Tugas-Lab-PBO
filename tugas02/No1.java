import java.util.Scanner;

import jdk.dynalink.beans.StaticClass;

public class No1 {

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
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    int Num1, Num2, Pilihan;

    Menu();
    System.out.print("Masukkan pilihan anda (angka) : ");
    Pilihan = Input.nextInt();

    if (Pilihan == 1) {
      System.out.println("++==========================================++");
      System.out.println("||                PENJUMLAHAN               ||");
      System.out.println("||==========================================||");
      
      System.out.print("Masukkan bilangan pertama : ");
      Num1 = Input.nextInt();

      System.out.print("Masukkan bilangan kedua : ");
      Num2 = Input.nextInt();

      System.out.println(Num1 + Num2);

    }else if (Pilihan == 2) {
      System.out.println("pilihan anda 2");
    }else if (Pilihan == 3) {
      System.out.println("pilihan anda 3");
    }else if (Pilihan == 4) {
      System.out.println("pilihan anda 4");
    }else if (Pilihan == 5) {
      System.out.println("pilihan anda 5");
    }else if (Pilihan == 6) {
      System.out.println("Keluar dari programm");
    } else {
      System.out.println("pilihan anda tidak tersedia");
    }

  }

}