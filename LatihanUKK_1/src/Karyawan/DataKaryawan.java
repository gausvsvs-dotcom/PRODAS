package Karyawan;

public class DataKaryawan {
        public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();

        karyawan.setNIP("1234509876");
        karyawan.setNama("Dyca");
        karyawan.setDivisi("Marketing");

        System.out.println("====== DATA KARYAWAN ======");
        System.out.println("NIP    : " + karyawan.getNIP());
        System.out.println("Nama   : " + karyawan.getNama());
        System.out.println("Divisi : " + karyawan.getDivisi());
    }
}

