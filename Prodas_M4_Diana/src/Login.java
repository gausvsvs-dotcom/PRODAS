
import java.io.InputStreamReader;
import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        String username = "270210";
        String password = "pwku";
        
        Scanner input = new Scanner(new InputStreamReader(System.in));
        System.out.println("Masukkan Username : ");
        String inputusername = input.nextLine();
        System.out.println("Masukkan Password : ");
        String inputpass = input.nextLine();
        
        if(inputusername.equals(username) && inputpass.equals(password)){
             System.out.println("Selamat Datang Di OCS!!");
        } else{
            System.out.println("Username Atau Passoword Salah!");  
        }
    }
    
}
