package Tugas2;
public class TestBus {
    public static void main(String[] args) {
        
        Bus miniBus = new Bus (400);
        
        miniBus.addPenumpang(56);
        miniBus.cetak();
        
        miniBus.addPenumpang(67);
        miniBus.addPenumpang(78);
        miniBus.addPenumpang(87);
        miniBus.cetak();
        
        System.out.println("Rata Rata berat penumpang : " + miniBus.getAvarege());
        
    }
}
