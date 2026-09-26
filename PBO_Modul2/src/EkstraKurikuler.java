/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class EkstraKurikuler {
    public static void main(String[] args) {
        EkstraKurikuler eskul = new EkstraKurikuler();
        eskul.setEskul ("");
        eskul.setGuru ("");
        eskul.setHari ("");
    }
    private void setEskul (String eskul){
    eskul = "Futsal";
    System.out.println("Ekstrakurikuler : " + eskul);
    
    }
    private void setGuru (String guru){
    guru = "Pak Ijul";
    System.out.println("Guru Pendamping : " + guru);
    }
     private void setHari (String hari){
    hari = "Senin";
    System.out.println("Hari  : " + hari);
    
    }
    
}
