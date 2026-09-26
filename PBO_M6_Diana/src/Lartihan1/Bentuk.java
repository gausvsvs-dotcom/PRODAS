package Lartihan1;

public class Bentuk {
    public void gambar(){
            System.out.println("Menggambar");
}
    public void hapus() {
            System.out.println("Menghapus");
}
}

class Segitiga extends Bentuk{
    public void gambar(){//overriding
        System.out.println("Menggambar Bentuk Segitiga");
    }
    public void hapus(){
        System.out.println("Menghapus Bentuk Segitiga");
    }
} 
class Oval extends Bentuk{
    public void gambar(){//overriding
        System.out.println("Menggambar Bentuk Oval");
    }
    public void hapus(){
        System.out.println("Menghapus Bentuk Oval");
    }
} 
class Persegi extends Bentuk{
    public void gambar(){//overriding
        System.out.println("Menggambar Bentuk Persegi");
    }
    public void hapus(){
        System.out.println("Menghapus Bentuk Persegi");
    }
} 

