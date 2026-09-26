package Perulangan;

import java.io.InputStreamReader;
import java.util.Scanner;

public class LatihanWhile2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (new InputStreamReader(System.in));
        System.out.println("===Lampu Ootomatis===");
        boolean malam = true;
        while(malam){
            System.out.println("Lampu nyala");
            //semisal terdapat sensor cahaya
            System.out.print("Apakah matahari sudah terbit (y/n) ? : ");
            String jawab = input.nextLine();
            if(jawab.equals("y")){
                malam = false;
            }
        }
        System.out.println("Sudah Pagi");
        System.out.println("Lampu Mati ");
    }
}
