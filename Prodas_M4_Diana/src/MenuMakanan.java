
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
public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("== MENU MAKANAN KANTIN ==");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Ayam Geprek");
        System.out.println("3. Mie Ayam");
        System.out.println("4. Indomie");
        System.out.println("5. Tahu Telor");
        System.out.println("Masukkan Pilihan Makanan : ");
        int pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("Anda Memilih Soto Ayam");
        }else if (pilih == 2){
            System.out.println("Anda Memilih Ayam Geprek");
        }else if(pilih == 3){
            System.out.println("Anda Memilih Mie Ayam");
        }else if(pilih == 4){
            System.out.println("Anda Memilih Indomie");
        }else if(pilih == 5){
            System.out.println("Anda Memilih Tahu Telor");
        }else{
            System.out.println("Pilihan Tidak Ada Pada Menu");
        }
        
    }   
}
