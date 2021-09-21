public class No33 {
  public static void main(String[] args) {
    String kalimat = "S(he) be(lie)ve(d)";

    System.out.println("+===================+");
    System.out.println("| "+kalimat+"|");
    System.out.println("| Girls : "+kalimat.substring(2, 4) + " " + kalimat.substring(9, 12) + kalimat.substring(16, 17)+"   |");
    System.out.println("| Boys : " +kalimat.substring(0, 1) + kalimat.substring(6, 8) + kalimat.substring(13, 15)+"      |");
    System.out.println("+===================+");
  }
}
//https://github.com/Amar-Suhendra/Tugas-Lab-PBO/tree/main/tugas03