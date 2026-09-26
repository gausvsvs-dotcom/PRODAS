package Tugas3;

public class Tugas3NullPoingterr {

    public static void main(String[] args) {
        try {
            String teks = null;// nilai null
            System.out.println("Panjang teks : " + teks.length()); // Memicu NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException!");
            System.out.println("Kesalahan : objek belum diinisialisasi (Masih null)");
        }
        System.out.println("Program tetap berjalan setelah exception ditangani.");

    }
}
