package Latihan3;
public class Siswa {
    private String nama;
    private String jurusan;
    private int usia;
    
    public String getNama(){ // method mutator
        return nama;
    }
    public void setNama(String nama) { // method accessor
        this.nama = nama;
    }
    public String getJurusan (){ // method mutator
        return jurusan;
    }
    public void setJurusan(String jurusan) { // method accessor
        this.jurusan = jurusan;
    }
    public int getUsia (){ //method accessor
        return usia;
    }
    public void setUsia(int usia){ //method mutator
        this.usia = usia;
    }
        
}
