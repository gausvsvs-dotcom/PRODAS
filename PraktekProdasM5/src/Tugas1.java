
import java.io.InputStreamReader;
import java.util.Scanner;


public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("apakah punya kartu member ya/tidak :");
        String member = input.nextLine();

        if (member.equalsIgnoreCase("ya")) {
            System.out.print("masukan jumblah belanjaan :");
            int belanja = input.nextInt();
            if (belanja > 500) {
                System.out.println("anda dapat diskon 50k");
            } else if (belanja > 100) {
                System.out.println("anda dapat disokon 15k");

            } else {
                System.out.println("tidak dapat diskon");
            }
        } else if (member.equalsIgnoreCase("tidak")) {
            System.out.println("masukan jumblah belanjaan: ");
            int belanja = input.nextInt();
            if (belanja > 100);
            System.out.println("anda dapat diskon 5k");

        } else {
            System.out.println("tidak dapat diskon");
        }

    }
}
