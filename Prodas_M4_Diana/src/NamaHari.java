
import java.io.InputStreamReader;
import java.util.Scanner;


public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("== NAMA NAMA HARI ==");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.println("Masukkan Pilihan Hari : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Anda Memilih Hari Senin");
                break;
            case 2:
                System.out.println("Anda Memilih Hari Selasa");
                break;
            case 3:
                System.out.println("Anda Memilih Hari Rabu");
                break;
            case 4:
                System.out.println("Anda Memilih Hari Kamis");
                break;
            case 5:
                System.out.println("Anda Memilih Hari Jumat");
                break;
            case 6:
                System.out.println("Anda Memilih Hari Sabtu");
                break;
            case 7:
                System.out.println("Anda Memilih Hari Minggu");
                break;
            default:
                System.out.println("Tidak Ada Pilihan Hari");
                
        }
    }
}
