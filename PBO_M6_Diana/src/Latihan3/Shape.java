/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

public class Shape {
    private String color;
    
    //constructor shape = method yang sama dengan nama class nya
    public Shape(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Shape [color="+color+"]";
    }
    
    public double getArea(){
        System.err.println("Area Belum Terdefinisikan");
        return 0;
    }
}
