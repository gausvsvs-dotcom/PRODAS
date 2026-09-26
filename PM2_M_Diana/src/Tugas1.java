/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Tugas1 {
    public static void main(String[] args) {
        
       //Deklarasi variable
        String nama = "Mohammad Hafidzy I";
        String jurusan = "Rekayasa Perangkat Lunak";
        int umur = 15;
        double nilai1 = 90.5;
        double nilai2 = 85.0;
        double tinggi = 174.5;
        boolean statusaktif = true;
        char inisial = 'F';
        
         //Hitung total nilai dan rata-rata
        double totalnilai = nilai1 + nilai2;
        double rataRata = totalnilai / 2;
      
    
        System.out.println("=== PROFIL SISWA ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Inisial       : " + inisial);
        System.out.println("Jurusan       : " + jurusan);
        
        //Simulasi ulang tahun (increment umur)
        System.out.println("Umur Sekarang : " + umur + " tahun");
        umur++; 
        System.out.println("Umur Setelah Ulang Tahun : " +  umur + "tahun");
        System.out.println("Tinggi Badan  : " + tinggi + " cm");
        System.out.println("Status Aktif  : " + true);
        System.out.println();

        System.out.println("=== NILAI SISWA ===");
        System.out.println("Nilai 1 : " + nilai1);
        System.out.println("Nilai 2 : " + nilai2);
        nilai1--;
        nilai2--;
        System.out.println("Total Nilai : " + totalnilai);
        System.out.println("Rata-rata Nilai : " + rataRata);
       
        
        
    }
}
 