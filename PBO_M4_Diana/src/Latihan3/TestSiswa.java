
package Latihan3;
public class TestSiswa {
    public static void main(String[] args) {
        
        Siswa siswa = new Siswa();
        
        siswa.setNama("Hafidzy");
        siswa.setJurusan("Rekayasa Perangkat Lunak");
        siswa.setUsia(15);
        
        System.out.println("Nama siswa : " + siswa.getNama());
        System.out.println("Jurusan : " + siswa.getJurusan());
        System.out.println("Usia : " + siswa.getUsia());
    }
}
