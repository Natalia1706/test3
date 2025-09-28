/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_classes_one;

/**
 *
 * @author kiara
 */
public class Circle extends Shape{
   
    // Data Fields
    private double radius;
    
    // Create a Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Implement/Override the Abstract CalaculateArea()
    @Override
    public double calculateArea(){
      //return (Math.PI * (radius*radius));
      return (Math.PI * Math.pow(radius, 2));
      
    } 
}