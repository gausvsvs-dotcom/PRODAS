/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

public class Rectangle extends Shape{
    
    private int panjang;
    private int lebar;
    
    public Rectangle(String color, int panjang,int lebar){
        super(color);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public String toString(){
        return "Ractangle [lenght:"+panjang+", widht:"+lebar+","+"color:"+super.toString()+"]";
    }
    @Override
    public double getArea(){
        return panjang*lebar;
        
    }
    
}
