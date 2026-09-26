
package Perusahaan;

public class DataKaryawan {

    
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();

        karyawan.setNIP("202509252025092023");
        karyawan.setNama("Stellara");
        karyawan.setDivisi("Marketing");

        System.out.println("====== DATA KARYAWAN ======");
        System.out.println("NIP    : " + karyawan.getNIP());
        System.out.println("Nama   : " + karyawan.getNama());
        System.out.println("Divisi : " + karyawan.getDivisi());
    }
}

