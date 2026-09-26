/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MataPelajaran {
    public static void main(String[] args) {
        MataPelajaran mapel = new MataPelajaran();
        mapel.setMapel("");
        mapel.setGuru("");
        mapel.setHari("");
        
    }
    
    private void setMapel (String mapel) {
        mapel = "Sejarah";
        System.out.println("Mapel : " + mapel);
    }
    private void setGuru (String guru) {
        guru = "Nita Resita";
        System.out.println("Guru : " + guru);
        
    }
     private void setHari (String hari) {
        hari = "Rabu";
        System.out.println("Hari : " + hari);
        
     
     
     }
}
