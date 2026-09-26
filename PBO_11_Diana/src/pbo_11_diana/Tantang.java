package pbo_11_diana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tantang {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIS : ");
        String nis = input.nextLine();

        int usia = 0;
        boolean inputBenar = false;

        // Perulangan untuk memastikan input usia valid (angka)
        do {
            try {
                System.out.print("Masukkan Usia: ");
                usia = input.nextInt();
                inputBenar = true; // jika berhasil, keluar dari loop
            } catch (InputMismatchException e) {
                System.out.println("Error: Usia harus berupa angka! Coba lagi.");
                input.nextLine(); // membersihkan input buffer
            }
        } while (!inputBenar);

        input.nextLine(); // bersihkan buffer sebelum input berikutnya

        System.out.print("Masukkan Kelas: ");
        String kelas = input.nextLine();

        System.out.println("\n=== Data Sekolah ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIS   : " + nis);
        System.out.println("Usia  : " + usia + " tahun");
        System.out.println("Kelas : " + kelas);

        input.close();
    }
}
