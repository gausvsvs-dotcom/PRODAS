package Tugas3;

public class TryCatchFinally {

    public static void main(String[] args) {
        System.out.println("**** MENGGUNAKAN BLOK TRY-CATCH FINALLY ******");
        try {
            int hasil = 9 / 3; //penyebab exceptiom
            System.out.println("Haasil pembagian =" + hasil);
            System.out.println("Pernyataan setelah bebas dari exception.");
        }
        catch(ArithmeticException exc){
                System.err.println("ArithmeticException Menangkap bebas dari exception.");
                System.err.println("Exception yang ditangkap adalah : " + exc);
                }
        finally {
            System.out.println("Pernyataan dalam blok finally.");
        }
        System.out.println("Pernyataan diluar blok try-catch-finally");
    }
}
