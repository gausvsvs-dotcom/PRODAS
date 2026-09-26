
package Tugas;

public class TestPembayaran {
    public static void main(String[] args) {
        Pembayaran p1 = new BayarTunai();
        Pembayaran p2 = new BayarQris();
        
        p1.pembayaran();
        p1.cetakStruk();
        
        p2.pembayaran();
        p2.cetakStruk();
    }
}
