package Latihan2;
public class UjiBus {
    public static void main(String[] args) {
        Bus bagong = new Bus(20);
        
        bagong.addPenumpang(3);
        bagong.cetak();
        
        bagong.addPenumpang(5);
        bagong.cetak();
        
        bagong.addPenumpang(6);
        bagong.cetak();
        
        bagong.addPenumpang(10);
        bagong.cetak();
    }
}
