
import java.io.InputStreamReader;
import java.util.Scanner;


public class Tugas5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan n: ");
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i));
            }
            for (int k = i; k < tinggi; k++) {
                System.out.print(" ");
            }

            System.out.print("  |  ");

            for (int spasi = tinggi - i; spasi > 0; spasi--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println(" ");
        }

    }

}
