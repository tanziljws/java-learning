import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        double luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
    }
}
