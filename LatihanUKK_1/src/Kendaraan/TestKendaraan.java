package Kendaraan;

public class TestKendaraan {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        
        k.setNoPolisi("N123AL");
        k.setMerk("APV");
        k.setTahun("2009");
        
        System.out.println("Data Kendaraan");
        System.out.println("Nomor Polisi : " + k.getNoPolisi());
        System.out.println("Merk kendaraan : " + k.getMerk());
        System.out.println("Tahun kendaraan : " + k.getTahun());
        
    }
}
