/**
 * @author Amar Suhendra
 * https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas01
 */
import java.util.Scanner;
public class tugas01AmarSuhendra {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //variabel
        int Jbarang, Hbarang, Tbarang; 
        float Diskon, Total;
        
        //meminta input jumlah barang
        System.out.println("== Masukkan data anda ==");
        System.out.print("Jumlah Barang :");
        Jbarang = Input.nextInt();

        //meminta input harga barang per unit
        System.out.print("Harga per unit :");
        Hbarang = Input.nextInt();
        
        //melakukan operasi
        Tbarang = Jbarang*Hbarang;
        Diskon = Tbarang*(15/100f); 
        Total = Tbarang - Diskon;

        //mencetak hasil
        System.out.println("== Result ==");
        System.out.println("Total Harga : "+ Total);
        
    }
}
