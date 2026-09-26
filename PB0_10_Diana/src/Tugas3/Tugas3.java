
package Tugas3;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        boolean valid = false;
        int a = 0, b = 0;
        
        while (!valid){
            try{
                System.out.print("Masukkan bilangan pertama : ");
                a = input.nextInt();
                System.out.print("Masukkan bilagan kedua ; ");
                b = input.nextInt();
                valid = true; // input benar, keluar dari loop
            }
            catch(InputMismatchException e){
                System.out.println("Input harus berupa angka !Silakan coba lagi.\n");
                input.nextLine();//membersihkan input buffer
            }
        }
        int hasil = a + b;
        System.out.println("Hasil penjumlahan = " + hasil);
    }
}
