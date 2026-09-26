package Tugas;

public class BayarTunai implements Pembayaran {

    @Override
    public void pembayaran() {
        System.out.println("Pembayaran dengan metode tunai");
    }
    @Override
    public void cetakStruk() {
       System.out.println("Struk hasil total pembayaran dan barang yang dibeli");
    }
    
}
