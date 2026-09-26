package Latihan2;

public class UjiTransportasi {
    public static void main(String[] args) {
        Transportasi t1 = new Mobil();
        Transportasi t2 = new Sepeda();
        
       t1.bergerak();
       t1.isiBahanBakar();
       
       t2.bergerak();
       t2.isiBahanBakar();
                
    }
}
