/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author ADMIN
 */
public class Triangle extends Shape{
    
    private double alas;
    private double tinggi;
    
    public Triangle(String color,double alas,double tinggi){
        super(color);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public String toString(){
        return "Triangle [base:"+alas+", height:"+tinggi+""+", color:"+super.toString()+"]";
    }
    @Override
    public double getArea(){
        return(alas * tinggi / 2);
    }
}


