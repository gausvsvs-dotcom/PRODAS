

package Latihan2;
public class Sepeda implements Transportasi{

    @Override
    public void bergerak() {
        System.out.println("Sepada bergerak menggunakan tenaga mnusia");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Sepeda termasuk transportasi yang ramah lingkungan");
    }
    
}
