
import java.util.Scanner;

public class VotingKetuaOsis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String input;

        System.out.println("===== PROGRAM VOTING OSIS =====");
        System.out.println("(Ketik \"selesai\"untuk mengakhiri)");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            input = scanner.next();

            if (input.equalsIgnoreCase("selesai"))
                break;

            if (input.equalsIgnoreCase("A"))
                suaraA++;
            else if (input.equalsIgnoreCase("B"))
                suaraB++;
            else
                System.out.println("Pilihan tidak valid!");
        }

        System.out.println("\n===== HASIL HITUNG CEPAT =====");
        System.out.println("Total Suara Kandidat A: " + suaraA);
        System.out.println("Total Suara Kandidat B: " + suaraB);
    }
}
