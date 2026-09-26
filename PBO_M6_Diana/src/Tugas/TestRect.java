/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

public class TestRect {

    public static void main(String[] args) {

        Rect persegi1 = new Rect(1, 5, 3, 5);//posisi x dan y
        System.out.println("Persegi1: (" + persegi1.x1 + "," + persegi1.y1 + ") to (" + persegi1.x2 + ", " + persegi1.y2 + ")");

        Rect persegi2 = new Rect(2, 4);//panjang lebar
        System.out.println("Persegi2: (" + persegi2.x1 + "," + persegi2.y1 + ") to (" + persegi2.x2 + ", " + persegi2.y2 + ")");

        Rect persegi3 = new Rect();//konstruktor kosong
        System.out.println("Persegi3: (" + persegi3.x1 + "," + persegi3.y1 + ") to (" + persegi3.x2 + ", " + persegi3.y2 + ")");

        persegi1.move(2, 3); //geser x: 2 y:3
        System.out.println("Persegi1 Geser: (" + persegi1.x1 + "," + persegi1.y1 + ") to (" + persegi1.x2 + ", " + persegi1.y2 + ")");

        boolean isInside = persegi1.isInside(3, 4);//cek apakah di dalam?
        System.out.println("Apakah titik (3, 4) ada didalam persegi1?" + isInside);

        Rect unionRect = persegi1.union(persegi2);//gabungan
        System.out.println("Gabungan Persegi1 dan Persegi2:  (" + unionRect.x1 + ", " + unionRect.y1 + ")" + "to (" + unionRect.x2 + ", " + unionRect.y2 + ")");

        Rect intersectionRect = persegi1.intersection(persegi2);//irisan
        System.out.println("Irisan Persegi1 dan Persegi2  (" + intersectionRect.x1 + ", " + intersectionRect.y1 + ") to (" + intersectionRect.x2 + ", " + intersectionRect.y2 + ")");

    }
}
