
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
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        if(nilai % 2 == 0){
            //jika benar
            System.out.println(nilai + "Adalah Bilangan Genap");
        } else {
            //jika tidak
            System.out.println(nilai + "Adalah Bilangan Ganjil");
        }
    }
}