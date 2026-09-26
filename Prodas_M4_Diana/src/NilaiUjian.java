
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NilaiUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner (new InputStreamReader(System.in));
        System.out.print("Masukkan Nilai Ujian : ");
        double nilai = input.nextDouble();
        if(nilai  >= 75){
            //jika benar
            System.out.println("NIlai : " + nilai);
            System.out.println("Anda Lulus!!");
        } else {
            //jika salah
            System.out.println("NIlai : " + nilai);
            System.out.println("Anda Remidial!!");
        }
    }
}
