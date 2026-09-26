
import java.io.InputStreamReader;
import java.util.Scanner;


public class Usia { 
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan Usia Anda : ");
        int usia = input.nextInt();
        
        if(usia < 18){
            System.out.println("Usia Anda : " + usia + " Tahun");
            System.out.println("Merupakan Kategori Remaja");
        }else if(usia >= 18 && usia <= 65){
            System.out.println("Usia Anda : " + usia + " Tahun");
            System.out.println("Merupakan Kategori Dewasa");
        }else{
            System.out.println("Usia Anda : " + usia + " Tahun") ;
            System.out.println("Merupakan Kategori Lansia") ;
        }
    }
}
