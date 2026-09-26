package Latihan1;

public class CobaPertama implements InterfaceA{

    @Override
    public void methodSatuA() {
        System.out.println("Isi methode pertama pada interface A");
    }

    @Override
    public String methodDuaA() {
        return atributA;
    }
    public static void main(String[] args) {
        CobaPertama cp = new CobaPertama();
        cp.methodSatuA();
        
        String pesan = cp.methodDuaA();
        System.out.println(pesan);
                
    }
    
    
}
