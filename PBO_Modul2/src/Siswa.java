/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Siswa {
    public static void main(String[] args) {
        Siswa siswa = new Siswa ();
        siswa.setNama("");
        siswa.setJurusan("");
        siswa.setNisn("");
    }
    
        private void setNama(String Nama) {
            Nama = "Mohammad Hafidzy I";
            System.out.println("Nama : " + Nama);
        }
       
        private void setJurusan(String Jurusan){
            Jurusan = "Rekayasa Perangkat Lunak";
            System.out.println("Jurusan : " + Jurusan);
            
        }
        private void setNisn(String Nisn){
            Nisn = "25996/2197.063";
            System.out.println("Nisn : " + Nisn);
            

    }
}
