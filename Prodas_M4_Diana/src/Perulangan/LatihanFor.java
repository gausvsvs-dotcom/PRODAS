package Perulangan;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LatihanFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan angka awal : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int b = input.nextInt();
        for (int x = a; x <= b; x++){
            if(x %2 == 0){
                System.out.println("Angka ke genap " + x);
            }
        }
    }
}  
// jika angka mulai dari 5 ke 1 maka menggunakan >= karena 5 lebih besar sama dengan 1
// jika menggunakan variabel x++ maka angka akan menambah dan sebaliknya jika menggunakan x-- nilai akan berkurang
// jika ingin menemukan angka ganji atau genap maka tambahkan if 