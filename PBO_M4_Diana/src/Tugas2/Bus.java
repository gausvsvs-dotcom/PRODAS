
package Tugas2;

public class Bus {
    private double penumpang;
    private double maxPenumpang;
    private int counter = 0;
    private double penumpangBaru;
    
    public Bus (double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(double penumpang){
        double tmp = this.penumpang + penumpang;
        if(tmp <= maxPenumpang){
            this.penumpang += penumpang;
            counter++;
        } else {
            System.out.println("Max Penumpang Tercapai");
            System.out.println("Berat Bus Sekarang " + this.penumpang);
        }
    }
    public void getPenumpang(int password){
            if(password == 123){
                System.out.println("Password Benar");
                System.out.println("Jumlah Penumpang Sekarang : " + counter + "orang" );
                System.out.println("Berat Penumpang Sekarang : " + penumpang + "kg" );
                System.out.println("Berat Max Penumpang  : " + maxPenumpang + "kg" );
            } else {
                System.out.println("Password Salah");
            }
        }
        public double getAvarege(){
            double rerata = penumpang/counter;
            return rerata;
        }
        public void cetak(){
            System.out.println("============");
            getPenumpang(123);
        }
    }

            
