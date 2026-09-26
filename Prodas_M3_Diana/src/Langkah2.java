
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Langkah2 {
    public static void main(String[] args) {
        int alas, tinggi, hasil;
        String a = JOptionPane.showInputDialog("Masukkan Alas : ");
        String t = JOptionPane.showInputDialog("Masukkan Tinggi : ");
        alas = Integer.parseInt(a);
        tinggi = Integer.parseInt(t);
        hasil = alas * tinggi /2;
        JOptionPane.showMessageDialog(null, "Hasil Luas Segitiga Adalah : " + hasil);
    }
}
