/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

public class Direktur extends Pegawai {
    public static final int  gajiDir = 100;
    public static final int  bonusDir = 30;
    
    Direktur (String nama){
        super(nama);
    }
    public int gaji(){
        return super.gaji()+gajiDir;
    }
    public int tunjangan(){
        return bonusDir;
    }
}


