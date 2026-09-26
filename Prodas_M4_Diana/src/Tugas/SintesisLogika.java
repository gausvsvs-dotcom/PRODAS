package Tugas;

    import java.util.Scanner;
import java.io.InputStreamReader;

public class SintesisLogika {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));

        int totalWaktu = 0;
        int jumlahPutaran = 5;

        System.out.println("=== Program Menghitung Waktu Lari ===");

        for (int i = 1; i <= jumlahPutaran; i++) {
            System.out.print("Masukkan waktu (menit) untuk putaran ke-" + i + ": ");
            int waktu = input.nextInt();
            totalWaktu += waktu;
        }

        System.out.println("\nTotal waktu lari: " + totalWaktu + " menit");

        if (totalWaktu < 25) {
            System.out.println("Kategori: Cepat");
        } else if (totalWaktu <= 35) {
            System.out.println("Kategori: Sedang");
        } else {
            System.out.println("Kategori: Perlu latihan");
        }

        input.close();
    }
}


