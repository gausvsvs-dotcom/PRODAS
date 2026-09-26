
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("===KALKULATOR SEDERHANA===");
        System.out.println("Pilibh sistem opersi");
        System.out.println("1. pengurangan");
        System.out.println("2. Penjumlahan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        
        System.out.println("Masukkan pilihan (1 - 4)");
        int pilihan = scanner.nextInt();
        
        System.out.println("Masukkan angka pertama : ");
        double a = scanner.nextDouble();
        
        System.out.println("Masukkan angka kedua : ");
        double b = scanner.nextDouble();
        
        double hasil = 0;
        
        switch (pilihan){
        case 1 :
            hasil = a - b;
            break;
        case 2 :
            hasil = a + b;
            break;
        case 3 :
            hasil = a * b;
            break;
        case 4 :
            hasil = a / b;
            break;
        default :
            System.out.println("Pilihan tidak valid");
                
        } 
        System.out.println("Hasil : " + hasil);
    }
}
