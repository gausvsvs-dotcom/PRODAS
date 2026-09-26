
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Latihan4 {
    public static void main(String[] args) {
        int nilai1, nilai2, rerata;
        String n1 = JOptionPane.showInputDialog("Masukkan Nilai 1 : ");
        String n2 = JOptionPane.showInputDialog("Masukkan Nilai 2 : ");
        nilai1 = Integer.parseInt(n1);
        nilai2 = Integer.parseInt(n2);
        rerata = (nilai1+nilai2) / 2;
        JOptionPane.showMessageDialog(null, "Rata Rata Nilai Adalah : " + rerata);
    }
}
