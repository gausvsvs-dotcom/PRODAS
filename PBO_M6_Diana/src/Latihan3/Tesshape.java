/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author ADMIN
 */
public class Tesshape {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle("red", 43, 54);
        System.out.println(rect);
        System.out.println(rect.getArea());
        
        Triangle tria = new Triangle("blue", 36, 67);
        System.out.println(tria);
        System.out.println(tria.getArea());
    }
}
