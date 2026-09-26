package Tugas;

import java.io.InputStreamReader;
import java.util.Scanner;

public class WaktuBelajar {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));

        int totalBelajar = 0;
        int jumlahHari = 7;

        System.out.println("=== Menghitung Waktu Belajar Mingguan ===");

        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("Masukkan jam belajar hari ke-" + i + ": ");
            int jamBelajar = input.nextInt();
            totalBelajar += jamBelajar;
        }

        double rataRata = (double) totalBelajar / jumlahHari;

        System.out.println("\nTotal waktu belajar: " + totalBelajar + " jam");
        System.out.println("Rata-rata belajar per hari: " + rataRata + " jam");

        if (totalBelajar >= 20) {
            System.out.println("Kategori: Rajin");
        } else if (totalBelajar >= 10) {
            System.out.println("Kategori: Cukup");
        } else {
            System.out.println("Kategori: Perlu ditingkatkan");
        }

        input.close();
    }
}
