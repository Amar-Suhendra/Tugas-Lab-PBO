/**
 * Tugas prak 8
 * @author  : Amar Suhendra
 * @version : tugas04-Alpha03
 * 
 * github : https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas04
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mahasiswa {
  String npm;
  String nama;
  int angkatan;

  Mahasiswa(String npm, String nama, int angkatan) {
    this.npm = npm;
    this.nama = nama;
    this.angkatan = angkatan;
  }
}

public class DataCollection {

  public static void main(String[] ar) {
    // ================ latihan 04 Array List Contoh
    // Membuat object dari kelas Mahasiswa
    Mahasiswa mhs1 = new Mahasiswa("1608107010021", "Fulan 21", 2016);
    Mahasiswa mhs2 = new Mahasiswa("1608107010002", "Fulan 2", 2016);
    Mahasiswa mhs3 = new Mahasiswa("1608107010046", "Fulan 46", 2016);

    // Membuat ArrayList
    List<Mahasiswa> mahasiswa = new ArrayList<>();
    mahasiswa.add(mhs1);
    mahasiswa.add(mhs2);
    mahasiswa.add(mhs3);
    // Perulangan menggunakan Interface Iterator
    // Iterator<Mahasiswa> itr = mahasiswa.iterator();
    // while (itr.hasNext()) {
    // Mahasiswa m = (Mahasiswa) itr.next();
    // System.out.println(m.npm + " " + m.nama + " " + m.angkatan);
    // }

    List<Mahasiswa> mahasiswa1 = new ArrayList<>();

    // = soal no 1: addAll()
    Collections.addAll(mahasiswa1, mhs1, mhs2, mhs3);
    // mencetak mahasiswa1
    Iterator<Mahasiswa> itr0 = mahasiswa1.iterator();
    while (itr0.hasNext()) {
      Mahasiswa m = (Mahasiswa) itr0.next();
      System.out.println(m.npm + " " + m.nama + " " + m.angkatan);
    }

    // == soal no 2 : removeAll()
    mahasiswa1.removeAll(mahasiswa1);
    Iterator<Mahasiswa> itr1 = mahasiswa1.iterator();
    while (itr1.hasNext()) {
      Mahasiswa m = (Mahasiswa) itr1.next();
      System.out.println(m.npm + " " + m.nama + " " + m.angkatan);
    }

    // === Soal no 3 : isEmpty()
    System.out.println("Apakah mahasiswa1 kosong? " + mahasiswa1.isEmpty()); // true

    // ==== Soal no 4 :
    System.out.println("Ukurang dari mahasiswa1 adalah : " + mahasiswa1.size());

    // ===== Soal no 5 : contains()
    System.out.println("Apakah mahasiswa1 mempunyai '2017'? " + mahasiswa1.contains(2017)); // false

    // ====== Soal no 6 : get()
    System.out.println("Mengambil index 0 dari mahasiswa : " + mahasiswa.get(0));
    // ================ end of latihan 04
  }
}