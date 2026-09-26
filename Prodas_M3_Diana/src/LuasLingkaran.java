
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari jari : ");
        double r  = input.nextDouble();
        
        System.out.println("Masukkan pi : ");
        double pi = input.nextDouble();
        
        double luas = pi * r * r ;
        System.out.println("Hasil Luas Lingkaran Adalah : " + luas );
    }
}
