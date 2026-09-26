 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Tugas1 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        
        int panjang, lebar, hasil;
        
        System.out.println("Rumus Menghitung LuasPersegi Panjang L = p x l");
        
        
        try {
        System.out.println("Masukkan Panjang : ");
        String p = input.readLine();
        System.out.println("Masukkan Lebar : ");
        String l = input.readLine();
        
        //parsing
        panjang = Integer.parseInt(p);
        lebar = Integer.parseInt(l);
        hasil = panjang * lebar ;
        
        System.out.println("Luas Persegi Panjang Adalah : " + hasil + "cm");
        }catch (IOException e){e.printStackTrace();
    }
}
}