package Kal;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(new InputStreamReader(System.in));

        System.out.println("== KALTOR SEDERHANA ==");
        System.out.println("1. Penjumlahann");
        System.out.println("2. Penguraangan");
        System.out.println("3. Pekaliaan");
        System.out.println("4. Pembagiaan");

        System.out.println("Masukkan anga metode perhitungan : ");
        int pilihan = inp.nextInt();
        System.out.println("Masukkan angka pertama : ");
        double a = inp.nextDouble();
        System.out.println("Masukkan angka kedua : ");
        double b = inp.nextDouble();

        double h = 0;

        switch (pilihan) {
            case 1:
                h = a + b;
                break;
            case 2:
                h = a - b;
                break;
            case 3:
                h = a * b;
                break;
            case 4:
                h = a / b;
                break;

            default:
                System.out.println("NO VALID");
        }
        
        System.out.println("Hasil hitungan : " + h);
    }
}
