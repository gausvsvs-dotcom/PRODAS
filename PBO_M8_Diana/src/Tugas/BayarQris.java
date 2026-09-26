
package Tugas;

public class BayarQris implements Pembayaran {

    @Override
    public void pembayaran() {
        System.out.println("Scan QR yang sudah tersedia untuk pembayaran berbasis Qris");
    }

    @Override
    public void cetakStruk() {
        System.out.println("Struk hasil total pembayaran dan barang yang dibeli ");
    }
    
}
