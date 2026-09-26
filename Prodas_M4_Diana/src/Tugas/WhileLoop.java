package Tugas;
import java.io.InputStreamReader;
import java.util.Scanner;
// Algoritma Sederhana: Menentukan Target Langkah
// 1. Mulai
// 2. Iput target = 5000, totalLangkah = 0, jam = 1
// 3. Ulangi selama totalLangkah < target:
        // >Masukkan jumlah langkah per jam
        // >Tambahkan ke totalLangkah
        // >Tampilkan total langkah saat ini
        // >Tambah jam dengan 1
// 4. Tampilkan pesan bahwa target telah tercapai
// 5. Selesaii

public class WhileLoop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(new InputStreamReader(System.in)); //Objek scanner digunakan untuk membaca input
        System.out.println("===Menentukan Target Seacara Otomatis===");
        int target = 5000; //Target langkah
        int totalLangkah = 0; //Total langkah awal
        int jam = 1; //Hitungan ajm keberapa

        //Perulangan while hinggga total langkah mencapai target 5000 langkah
        while (totalLangkah < target) {
            System.out.print("Masukkan langkah pada jam ke-" + jam + ": "); 
            int langkahPerJam = input.nextInt();  //Input langkah per jam
            totalLangkah += langkahPerJam;  //Menambahkan jumlah langkah per jam ke total langkah
            System.out.println("Total langkah saat ini: " + totalLangkah);
            jam++; //Naikkan jam
        }
        
        //Menampilkan pesan jika target tercapai
        System.out.println("Anda menempuh target " + target + " langkah telah tercapai dengan total langkah: " + totalLangkah);
        input.close(); //Menutup scanner
    }
}



