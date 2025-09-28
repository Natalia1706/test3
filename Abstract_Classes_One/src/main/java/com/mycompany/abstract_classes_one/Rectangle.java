/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_classes_one;

/**
 *
 * @author kiara
 */
public class Rectangle extends Shape{
    
    // Data Fields
   private double length;
   private double width;

   // Create a Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
   @Override
    public double calculateArea(){
    return length * width;   
    }
   
}
