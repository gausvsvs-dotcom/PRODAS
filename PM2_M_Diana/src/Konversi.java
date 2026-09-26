 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Konversi {
    public static void main(String[] args){
        int a = 50;
        double b = 49.5;
        String konfersi_a = String.valueOf(a);
        // konfersi dari integer ke string
        String konfersi_b = String.valueOf(b);
        //konfersi dari double ke string
        int pindah_keinteger = Integer.parseInt(konfersi_a);
        // konfersi dari string ke integer
        double pindah_kedouble = Double.parseDouble(konfersi_b);
        // konfersi dari string ke double
    }
}