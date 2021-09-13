import java.util.Scanner;

public class No2 {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);

    int Nilai;

    System.out.print("Masukkan nilai anda : ");
    Nilai = Input.nextInt();

    if (Nilai >= 87) {
      System.out.println("Nilai huruf anda : A dengan IP 4.00");
    }else if (78 <= Nilai && Nilai < 87) {
      System.out.println("Nilai huruf anda : AB dengan IP 3.50");
    }else if(69 <= Nilai && Nilai < 78) {
      System.out.println("Nilai huruf anda : B dengan IP 3.00");
    }else if(60 <= Nilai && Nilai < 69){
      System.out.println("Nilai huruf anda : BC dengan IP 2.50");
    }else if(51 <= Nilai && Nilai < 60){
      System.out.println("Nilai huruf anda : C dengan IP 2.00");
    }else if(41 <= Nilai && Nilai < 51){
      System.out.println("Nilai huruf anda : D dengan IP 1.00");
    }else if(Nilai < 41){
      System.out.println("Nilai huruf anda : E dengan IP 0.00");
    }
  }
}
