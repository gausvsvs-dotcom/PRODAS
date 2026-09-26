package Latihan2;

public class Mobil implements Transportasi {

    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak di jalan raya");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mobil menggunakan bahan bakar bensin");
    }

}
