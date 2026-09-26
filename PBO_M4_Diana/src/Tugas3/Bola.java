package Tugas3;
public class Bola {
    private double jarijari;
    
    public void setJarijari(double jari){
        jarijari = jari;
    }
    public double showDiameter(){
        double diameter = jarijari*2;
        return diameter;
    }
    public double showLuaspermukaan(){
        double luas = 4 * Math.PI * jarijari * jarijari;
        return luas;
    }
    public double showVolume(){
        double volume = 4/3 * Math.PI * jarijari * jarijari * jarijari;
        return volume;
    }
}

