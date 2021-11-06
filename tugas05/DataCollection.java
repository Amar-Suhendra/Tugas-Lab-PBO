//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.HashMap;
//import java.util.Map;

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

// class Buku {
// int id;
// String nama, pengarang, publisher;
// int jumlah;

// public Buku(int id, String nama, String pengarang, String publisher, int
// jumlah) {
// this.id = id;
// this.nama = nama;
// this.pengarang = pengarang;
// this.publisher = publisher;
// this.jumlah = jumlah;
// }
// }

public class DataCollection {

  public static void main(String[] ar) {
    // ============= latihan 01
    // // deklarasi dan inisialisasi array
    // int[] bil_bulat = { 3, 5, 7 };
    // String[] warna = { "merah", "hijau", "kuning" };
    // // menampilkan array
    // for (int i = 0; i < bil_bulat.length; i++) {
    // System.out.print(bil_bulat[i] + " ");
    // }
    // System.out.println();
    // for (int i = 0; i < warna.length; i++) {
    // System.out.print(warna[i] + " ");
    // }
    // System.out.println();
    // // deklarasi dan inisialisasi array 2D
    // int arr[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 5, 6, 7 } };
    // // menampilkan array 2D
    // for (int i = 0; i < 3; i++) {
    // for (int j = 0; j < 3; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }
    // // ============= end of latihan 01

    // // ============= latihan 02 Array Satu Dimensi
    // System.out.println("Array of primitives");
    // int[] ints = { 9, 6, 3 };
    // Arrays.sort(ints);
    // for (int i = 0; i < ints.length; i++) {
    // System.out.println(ints[i]);
    // }
    // System.out.println("Array of strings");
    // String[] strings = { "Merah", "Hijau", "Biru" };
    // Arrays.sort(strings);
    // for (String color : strings) {
    // System.out.println(color);
    // }
    // System.out.println("Setting an initial size");
    // int[] sized = new int[10];
    // for (int i = 0; i < sized.length; i++) {
    // sized[i] = i * 100;
    // }
    // for (int value : sized) {
    // System.out.println(value);
    // }
    // System.out.println("Copying an array");
    // int[] copied = new int[5];
    // System.arraycopy(sized, 5, copied, 0, 5);
    // for (int value : copied) {
    // System.out.println(value);
    // }
    // // ============= end 0f latihan 02

    // // ============= latihan 03 Array Multi Dimensi
    // String[][] provinsi = new String[3][2];
    // provinsi[0][0] = "Aceh";
    // provinsi[0][1] = "Banda Aceh";
    // provinsi[1][0] = "Maluku Utara";
    // provinsi[1][1] = "Sofifi";
    // provinsi[2][0] = "Papua Barat";
    // provinsi[2][1] = "Manokwari";
    // for (int i = 0; i < provinsi.length; i++) {
    // StringBuilder sb = new StringBuilder();
    // sb.append("Ibukota ").append(provinsi[i][0]).append(" adalah
    // ").append(provinsi[i][1]).append(".");
    // System.out.println(sb);
    // }
    // // ============= end of latihan 03

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
    Iterator<Mahasiswa> itr0 = mahasiswa.iterator();
    while (itr0.hasNext()) {
      Mahasiswa m = (Mahasiswa) itr0.next();
      System.out.println(m.npm + " " + m.nama + " " + m.angkatan);
    }

    // == soal no 2 : removeAll()
    mahasiswa1.removeAll(mahasiswa);
    Iterator<Mahasiswa> itr1 = mahasiswa.iterator();
    while (itr1.hasNext()) {
      Mahasiswa m = (Mahasiswa) itr1.next();
      System.out.println(m.npm + " " + m.nama + " " + m.angkatan);
    }

    // === Soal no 3 : isEmpty()
    System.out.println(mahasiswa1.isEmpty()); // true

    // ==== Soal no 4 : 
    System.out.println(mahasiswa1.size());

    // ===== Soal no 5 : contains()
    System.out.println(mahasiswa1.contains(2017));

    //====== Soal no 6 : get()
    System.out.println(mahasiswa.get(0));
    // ================ end of latihan 04

    // // ================ latihan 05
    // // Membuat map Buku
    // Map<Integer, Buku> map = new HashMap<Integer, Buku>();
    // // Membuat objek Buku

    // Buku b1 = new Buku(101, "Design Patterns: Elements of Reusable
    // Object-Oriented Software", "Erich Gamma",
    // "Addison-Wesley Professional", 8);
    // Buku b2 = new Buku(102, "Problem Frames: Analysing & Structuring Software
    // Development Problems", "Michael Jackson",
    // "Addison-Wesley Professional", 4);
    // Buku b3 = new Buku(103, "Software Architecture in Practice", "LenBass",
    // "Addison-Wesley Professional", 6);
    // // Menambahkan Buku ke map
    // map.put(1, b1);
    // map.put(2, b2);
    // map.put(3, b3);
    // // Proses Traversing map
    // for (Map.Entry<Integer, Buku> entry : map.entrySet()) {
    // int key = entry.getKey();
    // Buku b = entry.getValue();
    // System.out.println(key + " Details:");
    // System.out.println(b.id + " " + b.nama + " " + b.pengarang + "" + b.publisher
    // + " " + b.jumlah);
    // }
    // // ================ end of latihan 05
  }
}