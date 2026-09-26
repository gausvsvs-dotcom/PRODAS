
import java.io.InputStreamReader;
import java.util.Scanner;

public class DeteksiAngka {
    //angka positif,negatif,nol
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("Masukkan Nilai : ");
        int angka = input.nextInt();
        if (angka >= 1){
            System.out.println("Positif ");
            
        }else if(angka == 0){
            System.out.println("Nol");
        }else{
            System.out.println("Negatif");
        }
    }
}
