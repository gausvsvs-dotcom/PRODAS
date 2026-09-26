
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
public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan Total Pembelian : ");
        double angka = input.nextDouble();
        if(angka >= 100000 ){
           double diskon = angka * 0.10;
           double totalBayar = angka - diskon;
            System.out.println("Total Belanja Anda : Rp" + angka);
            System.out.println("Diskon 10% : Rp " + diskon);
            System.out.println("Total Yang Harus Dibayar : Rp " + totalBayar);
        } else {
            System.out.println("Total Belanja Anda : Rp "+ angka);
            System.out.println("Tidak Ada diskon. Total Yang Harus DIbayar : Rp " + angka);
        }
    }
}
