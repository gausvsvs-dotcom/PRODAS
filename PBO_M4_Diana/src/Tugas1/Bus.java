package Tugas1;
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public Bus(int maxPenumpang){
        penumpang = 0;
        this.maxPenumpang = maxPenumpang;
    }
    
    public void addPenumpang(int penumpang){
        int tmp = this.penumpang + penumpang;
        if (tmp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = tmp;
        }
    }
    
    public String getPenumpang(int pass){
        String data;
        if(pass == 123){
            data = "Data jumlah penumpang " + this.penumpang;
        } else {
            data = "Passsword Salah";
        }
        return data;
    }
    
    public void cetakMaxPenumpang(){
        System.out.println("Max Penumpang : " + this.maxPenumpang);
    }
    
    }

