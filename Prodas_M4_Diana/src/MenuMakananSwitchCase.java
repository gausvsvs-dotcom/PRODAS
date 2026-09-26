
import java.io.InputStreamReader;
import java.util.Scanner;


public class MenuMakananSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("== MENU MAKANAN KANTIN ==");
        System.out.println("1. Soto Ayam");
        System.out.println("2. Ayam Geprek");
        System.out.println("3. Mie Ayam");
        System.out.println("4. Indomie");
        System.out.println("5. Tahu Telor");
        System.out.println("Masukkan Pilihan Makanan : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Anda Memilih Soto Ayam");
                break;
            case 2:
                System.out.println("Anda Memilih Ayam Geprek");
                break;
            case 3:
                System.out.println("Anda Memilih Mie Ayam");
                break;
            case 4:
                System.out.println("Anda Memilih Indomie");
                break;
            case 5:
                System.out.println("Anda Memilih Tahu Telor");
                break;
                default:
                    System.out.println("Pilihan Tidak Ada Di Menu");
                
        }
    }
}
