package Tugas3;
public class TestBola {
    public static void main(String[] args) {
        
        Bola bola = new  Bola();
        
        bola.setJarijari(10);
        bola.showDiameter();
        bola.showLuaspermukaan();
        bola.showVolume();
        
        System.out.println("Diameter : " + bola.showDiameter());
        System.out.println("Luas Permukaan : " + bola.showLuaspermukaan());
        System.out.println("Volume : " + bola.showVolume());
        
        bola.setJarijari(10);
        bola.showDiameter();
        bola.showLuaspermukaan();
        bola.showVolume();
        
        System.out.println("===================");
        
        System.out.println("Diameter : " + bola.showDiameter());
        System.out.println("Luas Permukaan : " + bola.showLuaspermukaan());
        System.out.println("Volume : " + bola.showVolume());
    }
}
