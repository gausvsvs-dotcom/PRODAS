
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas4 {
   


   
    public static void main(String[] args) throws IOException {
        // Menggunakan class System dan Process (melalui InputStreamReader)
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = Integer.parseInt(input.readLine());

        if (angka % 2 == 0) {
            System.out.println("Bilangan " + angka + " adalah bilangan GENAP.");
        } else {
            System.out.println("Bilangan " + angka + " adalah bilangan GANJIL.");
        }

        // Contoh penggunaan Process (menjalankan perintah sistem)
        System.out.println("\nMenjalankan proses sistem (contoh: menampilkan waktu)...");

        Process proses = Runtime.getRuntime().exec("cmd /c time /t");
        BufferedReader hasil = new BufferedReader(new InputStreamReader(proses.getInputStream()));

        String baris;
        while ((baris = hasil.readLine()) != null) {
            System.out.println("Waktu sistem saat ini: " + baris);
        }
    }
}

