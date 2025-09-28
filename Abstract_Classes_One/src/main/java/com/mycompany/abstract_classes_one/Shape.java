/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_classes_one;

/**
 *
 * @author kiara
 */
public abstract class Shape {
    
    // Create a Abstract Method to Calculate Area
    public abstract double calculateArea();
    
    // Create a Display Method --> Concrete Method (Normal Method)
    public void display(){
    System.out.println("The Area of the Shape is >>>>>> ");  
        
    }
}
