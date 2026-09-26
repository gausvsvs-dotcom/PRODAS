
import java.io.InputStreamReader;
import java.util.Scanner;


public class Tugas2 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(new InputStreamReader(System.in));

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        // Pembulatan ke atas
        int bulatAtas = (int) Math.ceil(angka);

        // Pembulatan ke bawah
        int bulatBawah = (int) Math.floor(angka);

        System.out.println("Angka asli: " + angka);
        System.out.println("Dibulatkan ke atas: " + bulatAtas);
        System.out.println("Dibulatkan ke bawah: " + bulatBawah);
    }
}

