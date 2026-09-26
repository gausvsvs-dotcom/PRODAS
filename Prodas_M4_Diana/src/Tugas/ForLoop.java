package Tugas;

import java.io.InputStreamReader;
import java.util.Scanner;

//Algoritma Sederhana: Menghitung Air yang Diminum
// 1. Mulai
// 2. Tampilkan “== Menghitung Air yang Diminum ==”339
// 3.Inisialisasi totalAir = 0 dan jumlahGelas = 8
// 4.Ulangi 8 kali:
        // >Masukkan jumlah air per gelas
        // >Tambahkan ke totalAir
// 5. Tampilkan total air yang dikonsumsi
// 6. Jika totalAir ≥ 2000 → Tampilkan “Memenuhi standar kesehatan” Jika tidak → Tampilkan “Tidak memenuhi standar kesehatan”
// 7. Selesai

public class ForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));

        System.out.println("== Menghitung Air yang Diminum ==");

        int totalAir = 0;
        int jumlahGelas = 8; // misalnya 8 gelas per hari
        
        for (int x = 1; x <= jumlahGelas; x++) {
            System.out.print("Masukkan jumlah air (ml) yang diminum pada gelas ke-" + x + ": ");
            int jumlahAir = input.nextInt();
            totalAir += jumlahAir;
        }
        System.out.println("Jumlah gelas yang diminum: " + jumlahGelas);

        double rataRata = (double) totalAir / jumlahGelas;
        System.out.println("Rata-rata per gelas: " + rataRata + " ml");
        
        if (totalAir >= 2000) {
            System.out.println("Memenuhi standar kesehatan (minimal 2000 ml)");
        } else {
            System.out.println("️Tidak memenuhi standar kesehatan");
        }

        input.close();
    }
}
