/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstract_classes_one;

/**
 *
 * @author kiara
 */
public class Abstract_Classes_One {

    public static void main(String[] args) {
        /*
        Abstract Class:
        Classes that are only created to extend from are known as abstract classes.
        Abstratc classes cannot be instantiated and can contain both abstratc and 
        concrete methods. An abstract method does not contain a method body and 
        must be implemented in the subclasses that extend a abstract class.
        */
        
       /*
        EXERCISE
        Create an Abstract Class Named SHAPE that contains an Abstract Method
        to calculate the area of a shape and a regular display method. Next
        create a SubClass called CIRCLE with one data field for the radius and 
        create a SubClass Called RECTANGLE with two data fields for the 
        length and width
        */
        System.out.println("*".repeat(10) + "Circle" + "*".repeat(10));
        //Create an Instance of Classes
        Circle c = new Circle(5);
        System.out.println(c.calculateArea());
        
        System.out.println();
        
        System.out.println("*".repeat(10) + "Rectangle" + "*".repeat(10));
        Rectangle r = new Rectangle(10,5);
        System.out.println(r.calculateArea());
    }
}
