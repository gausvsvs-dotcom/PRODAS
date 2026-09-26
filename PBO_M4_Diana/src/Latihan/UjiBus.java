
package Latihan;
public class UjiBus {
    public static void main(String[] args) {
        //intalasi object
        Bus juragan99 = new Bus();
        juragan99.penumpang = 3;
        juragan99.maxPenumpang = 20;
        juragan99.cetak();
        
        juragan99.penumpang = juragan99.penumpang + 4;
        juragan99.cetak();
        
        juragan99.penumpang += 5;
        juragan99.cetak();
        
        juragan99.penumpang += 6;
        juragan99.cetak();
        
    }
}
