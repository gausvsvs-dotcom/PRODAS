/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

public class Staff extends Pegawai{
    public static final int gajiStaff = 5000; 
    public static final int bonusStaff = 200;
    
    Staff(String nama){
        super(nama);
    }
    public int gaji(){
        return super.gaji()+gajiStaff;
    }
    public int bonusStaff(){
        return bonusStaff;
    }
}
