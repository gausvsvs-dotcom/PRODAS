
import java.io.InputStreamReader;
import java.util.Scanner;


public class GradeNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        nilai/=10;
        switch (nilai){
            case 10:
                System.out.println("S");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
