
package Latihan2;
public class Bus {
    private int penumpang;
    private int maxPenumpang;
    
    public Bus(int maxPenumpang){//
        this.penumpang = 0;
        this.maxPenumpang = maxPenumpang;
    }
    public void addPenumpang (int penumpang){
        if(this.penumpang <= this.maxPenumpang){
            this.penumpang += penumpang;
            System.out.println("Penumpang Bertambah : " + penumpang);
        } else {
                System.out.println("Bis Penuh");
        }
    }
    public void cetak(){
         System.out.println("Jumlah Penumpang : " + penumpang);    
         System.out.println("Max Penumpang : " + maxPenumpang);    
         System.out.println("-------------------------");    
        
        }
}
