package Latihan1;

public class CobaKedua implements InterfaceB, InterfaceA {

    @Override
    public void methodSatuB() {
        System.out.println("Isi method pertama pada interface B");
    }

    @Override
    public void methodDuaB() {
        System.out.println("Isi method kedua pada interface B");
    }

    @Override
    public void methodSatuA() {
        System.out.println("Isi method kedua pada interface A");
    }

    @Override
    public String methodDuaA() {
        return atributA;
    }

    public static void main(String[] args) {
        CobaKedua ck = new CobaKedua();
        String pesan = ck.methodDuaA();
        System.out.println(pesan);

        ck.methodSatuA();
        ck.methodSatuB();
        ck.methodDuaB();
    }

}
