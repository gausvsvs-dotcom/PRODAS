
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
public class Latihan1 {
    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        try {
            System.out.println("Masukkan Nama Anda : ");
            nama = input.readLine();
            System.out.println("Selamat Datang : " + nama + "!!");
            
              
        } catch(IOException e){
                    e.printStackTrace();
        }
        
        }   
    }
