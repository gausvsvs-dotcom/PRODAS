/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;
public class TestPegawai {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur){
            uang += ((Direktur) peg).tunjangan();
        }
        if(peg instanceof Staff){
            uang += ((Staff) peg).bonusStaff();
        }
            return uang;
    }
    public static void main(String[] args) {
        TestPegawai tp = new TestPegawai();
        
        Direktur dir = new Direktur("Mark 2");
        System.out.println("erhitungan Gaji : ");
        System.out.println("Nama Pegawai : " + dir.nama);
        System.out.println("Total Gaji : " + tp.hitungGaji(dir));
    }
}
    