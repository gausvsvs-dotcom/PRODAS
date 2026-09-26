
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int start = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}
