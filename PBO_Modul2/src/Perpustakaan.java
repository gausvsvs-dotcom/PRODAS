/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Perpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
           perpus.setNama("");
           perpus.setBuku("");
           perpus.setPinjam("");
           perpus.setMati("");
           
    }       
        private void setNama (String nama) {
            nama = "Bima";
            System.out.println("Nama Peminjam : " + nama);
            
        }
        private void setBuku (String nama) {
            nama = "Timun Emas";
            System.out.println("Buku Yang DIpinjam : " + nama);
            
        }
        private void setPinjam (String nama) {
            nama = "Rabu 09-09-2025";
            System.out.println("Dipinjam Pada : " + nama);
            
        }
            private void setMati (String nama) {
            nama = "Rabu 16-09-2025";
            System.out.println("DIkembalikan Pada : " + nama);
        
  }
    
}
