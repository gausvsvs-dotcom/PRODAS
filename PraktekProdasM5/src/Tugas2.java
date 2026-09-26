
import java.io.InputStreamReader;
import java.util.Scanner;


public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        String jawab;
        int hitung = 0;

        while (true) {
            System.out.println("apakah kamu ingin keluar ? ");
            System.out.println("jawab ya/tidak");
            jawab = input.nextLine();

            hitung++;
            if (jawab.equalsIgnoreCase("ya")) {

                break;
            }
        }
        System.out.println("anda melakukan perulangan sebanyak " + hitung + "kali");
    }
}
