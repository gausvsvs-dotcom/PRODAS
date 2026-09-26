
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
public class Perbandingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        int angka1,angka2,angka3;
        
        System.out.print("Masukkan Angka 1 : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        angka2 = input.nextInt();
        System.out.print("Masukkan Angka 3 : ");
        angka3 = input.nextInt();
        
        if(angka1 > angka2 && angka1 > angka3){
            System.out.println("Angka Terbesar Adalah : " + angka1);
        }else if(angka2 > angka1 && angka2 > angka3){
            System.out.println("Angka Terbesar Adalah : " + angka2);
        }else {
            System.out.println("Angka Terbesar Adalah : " + angka3);
        }
    }
}
