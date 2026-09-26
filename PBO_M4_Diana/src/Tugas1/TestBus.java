
package Tugas1;
public class TestBus {
    public static void main(String[] args) {
        Bus bagong = new Bus(30);
        bagong.cetakMaxPenumpang();
        
        bagong.addPenumpang(5);
        System.out.println(bagong.getPenumpang(123));
        
        System.out.println("===============");
        
        bagong.addPenumpang(15);
        System.out.println(bagong.getPenumpang(321));
        System.out.println(bagong.getPenumpang(123));
        
        System.out.println("===============");
        
        bagong.addPenumpang(10);
        System.out.println(bagong.getPenumpang(123));
    }
}
