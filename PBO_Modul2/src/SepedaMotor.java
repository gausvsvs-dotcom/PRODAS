/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SepedaMotor {
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("");
        motor.setNama("");
    }
    
        private void setMerk(String merk) {
            merk = "Honda";
            System.out.println("Merek motor adalah" + merk);
        }
       
        private void setNama(String nama){
            nama = "Beat";
            System.out.println("Nama motor adalah" + nama);
            
        }
    
}
 