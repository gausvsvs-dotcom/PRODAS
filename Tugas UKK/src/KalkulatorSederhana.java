
import java.util.Scanner;


    public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== KALKULATOR SEDERHANA =====");
        System.out.println("Pilih Operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan pilihan (1–4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan angka kedua  : ");
        double b = scanner.nextDouble();

        double hasil = 0;

        switch (pilihan) {
            case 1 -> hasil = a + b;
            case 2 -> hasil = a - b;
            case 3 -> hasil = a * b;
            case 4 -> hasil = a / b;
            default -> System.out.println("Pilihan tidak valid!");
        }

        System.out.println("Hasil: " + hasil);
    }
}

