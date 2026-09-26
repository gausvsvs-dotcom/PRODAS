
import java.util.Scanner;

public class PendaftaranGYM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        String a;
        
        System.out.println("===Pendaftaran Anggotoa Gym===");
        
        do{
            System.out.println("Masukkan Nama Anggota : ");
            String nama = scanner.nextLine();
            
            total++;
            
            System.out.println("Daftar lagi (ya/tidak)");
            a = scanner.nextLine();
        } while (a.equalsIgnoreCase("ya"));
        System.out.println("Total anggota yang daftar : " + total);
    }
}
