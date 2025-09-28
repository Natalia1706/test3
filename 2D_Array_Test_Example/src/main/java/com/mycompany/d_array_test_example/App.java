/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.d_array_test_example;

import java.util.Scanner;

/**
 *
 * @author kiara
 */
public class App {

    public static void main(String[] args) {
//      
//        // Import Scanner
//        Scanner kb = new Scanner(System.in);
//        
//        int row = 5;
//        int col = 4;
//      
       
        // Create an Array for the speed limits
        int speedLimits[][] = {{128,135,139},
                           {155,129,175},
                           {129,130,185},
                           {195,155,221}};
        
        // Create a 1D array for the months(heading)
        String Months[] = {"JAN", "FEB" , "MAR"};
        
        // Create a 1D array for the Cities
        String Cities[] = {"JHB", "DBN" , "CTN" , "PE"};
        
        // Format
        System.out.println("*".repeat(50) + "\nSPEEDING FINES REPORT\n" + "*".repeat(50));
        
        // Display months
        System.out.println("\t" + Months[0] + "\t" + Months[1] + "\t" + Months[2]);
        
        // Outter Loop --> Rows
        for (int i = 0; i < speedLimits.length; i++) {
            System.out.print(Cities[i] + "\t");
            
            // Inner Loop --> Column
            for (int j = 0; j < speedLimits[i].length; j++) {
                System.out.print(speedLimits[i][j] +"km"+ "\t");
            }
            // To leave a line
            System.out.println();
        }
        
        // Format
        System.out.println("*".repeat(50) + "\nSPEEDING FINES STATISTICS\n" + "*".repeat(50));
        
        // Intiliase max and min array values to 0
        int max = speedLimits[0][0];
        int min = speedLimits[0][0];
        
        // Checking for max and min value in the array
        for (int i = 0; i < speedLimits.length; i++) {
            for (int j = 0; j < speedLimits[i].length; j++) {
                if (speedLimits[i][j] > max) {
                    max = speedLimits[i][j];
                }
                
                if (speedLimits[i][j] < min) {
                    min = speedLimits[i][j];
                }
            }
        }
        
        // Display
        System.out.println("Maximum speed captured: " + max + "km");
        System.out.println("Minimum speed captured: " + min + "km");
        System.out.println("*".repeat(50));
        
//            int max = 0;
//            if (max >= 221) {
//                System.out.println("Maximum speed captured: " + max + "km");
//            }
//            
//            int min = 0;
//            if (min <= 120) {
//                System.out.println("Minimum speed captured: " + min + "km");
//            }
//           System.out.println("*".repeat(50)); 
        
    }
}
