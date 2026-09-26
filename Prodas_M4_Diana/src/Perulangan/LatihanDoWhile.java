package Perulangan;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LatihanDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan angka awal : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int b = input.nextInt();
        do {
            System.out.println("Angka ke- " + a);   
            a--;
        } while (a >= b);
    }
}
