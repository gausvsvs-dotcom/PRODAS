
package Tugas;
import java.io.InputStreamReader;
import java.util.Scanner;

//Algoritma Menghitung Tabungan Otomatis
// 1. Mulai
// 2. Input totalTabungan = 0 dan hari = 0
// 3. Ulangi langkah berikut sampai totalTabungan ≥ 100000:
        // >Masukkan jumlah uang yang ditabung
        // >Tambahkan ke totalTabungan
        // >Tambah hari dengan 1

// 4. Tampilkan jumlah hari dan total tabungan
// 5. Selesai

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("==Menghitung Tabungan secara otomatis==");
        int totalTabungan = 0;
        int hari = 1;

        do {
            System.out.print("Masukkan jumlah uang yang ditabung pada hari ke-" + hari + ": ");
            int uang = input.nextInt();
            totalTabungan += uang;
            hari++;
        } while (totalTabungan < 100000);

        System.out.println("Jumlah hari yang dibutuhkan: " + hari);
        System.out.println("Total tabungan: Rp" + totalTabungan);

        input.close();
    }
}


