import java.util.Scanner;

public class bab6soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();

        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();

        String grade;
        String keterangan;

        if (nilai >= 85) {
            grade = "A";
            keterangan = "LULUS";
        } else if (nilai >= 70) {
            grade = "B";
            keterangan = "LULUS";
        } else if (nilai >= 55) {
            grade = "C";
            keterangan = "LULUS BERSYARAT";
        } else if (nilai >= 40) {
            grade = "D";
            keterangan = "TIDAK LULUS";
        } else {
            grade = "E";
            keterangan = "GAGAL";
        }

        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}