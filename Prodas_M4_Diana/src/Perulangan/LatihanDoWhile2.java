package Perulangan;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LatihanDoWhile2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("===Program Jajan di Kantin===");
        boolean jajan = true;
        do {
            System.out.println("Pergi jajan ke kantin");
            System.out.print("Masi mau jajan lagi (y/n) ? :");
            String jawab = input.nextLine();
            if (jawab.equals("y")) {
                jajan = false;
            }
        } while (jajan);
        System.out.println("Sudah kenyang");
        System.out.println("Kembali dari kantin");
    }
}