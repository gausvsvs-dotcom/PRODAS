
package Tugas2;

public class TestKendaraan {

    public static void main(String[] args) {
        Kendaraan kendaraan= new Kendaraan();
        
        kendaraan.setNoPolisi("M 2509 BP");
        kendaraan.setMerk("Ferrari");
        kendaraan.setTahun(2025);
        
        System.out.println("=====Data Kendaraan");
        System.out.println("No.polisi : " + kendaraan.getNoPolisi());
        System.out.println("Merk Mobil: " + kendaraan.getMerk());
        System.out.println("Tahun     : " + kendaraan.getTahun());
    }
}

