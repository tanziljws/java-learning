import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        System.out.print("Masukkan gaji (dalam angka): ");
        double gaji = scanner.nextDouble();

        // Output data karyawan
        System.out.println("\nData Karyawan:");
        System.out.println("Nama karyawan : " + namaKaryawan);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Usia          : " + usia + " tahun");
        System.out.printf("Gaji          : Rp %.2f%n", gaji);
    }
}
