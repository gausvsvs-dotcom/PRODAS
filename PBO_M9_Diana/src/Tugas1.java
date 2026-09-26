
public class Tugas1 {
    public static void main(String[] args) {

        int[] bilangan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int terbesar = bilangan[0];
        int terkecil = bilangan[0];

        for (int a : bilangan) {
            terbesar = Math.max(terbesar, a);
            terkecil = Math.max(terkecil, a);
        }
        
        System.out.println("Dari Bilangan : 1,2,3,4,5,6,7,8,9,10");
        System.out.println("Bilangan yang terbesar: " + terbesar);
        System.out.println("Bilangan yang terkecil: " + terkecil);
    }
}

