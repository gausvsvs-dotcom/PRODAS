
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
public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader input =  new BufferedReader (new InputStreamReader(System.in));
        
        int nilai1, nilai2, rerata;
        
        try{
            System.out.println("Masukkan nilai1");
            String n1 = input.readLine();
            System.out.println("Masukkan nilai2");
            String n2 = input.readLine();
            
            //parsing
            nilai1 = Integer.parseInt(n1);
            nilai2 = Integer.parseInt(n2);
            rerata = (nilai1 + nilai2) / 2;
            System.out.println("Rata Rata Nilai Adalah ; " + rerata);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

