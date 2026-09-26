
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Tugas2 {
    public static void main(String[] args) {
        int panjang, lebar, hasil;
        
        String p = JOptionPane.showInputDialog("Masukkan Panjang : ");
        String l = JOptionPane.showInputDialog("Masukkan Lebar : ");
        
        panjang = Integer.parseInt(p);
        lebar = Integer.parseInt(l);
        hasil = panjang * lebar ;
        
        JOptionPane.showMessageDialog(null, "Hasil Luas Persegi Panjang " + hasil + "cm");
    }
}
 