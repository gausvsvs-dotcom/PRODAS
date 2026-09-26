
import java.util.Scanner;

public class VotingKetos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        
        int suaraA = 0;
        int suaraB = 0;
        String input;
        
        System.out.println("===Pemilihan Ketua Osis===");
        
        
        while (true) {
            System.out.println("Masukkan pilihan a atau b ?");
            input = scanner.next();
            
            if (input.equalsIgnoreCase("Selesai"))
                break;
            
            if (input.equalsIgnoreCase("A"))
                break;
            suaraA++;
                    
            if (input.equalsIgnoreCase("B"))
                break;
            suaraB++;
        }
        
        System.out.println("Hasil Pemungutan Suara" );
        System.out.println("Total yang memilih kandidat A" + suaraA++);
        System.out.println("Total yang memilih kandidat B" + suaraB++);
        
    }
}
