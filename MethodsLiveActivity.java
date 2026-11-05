/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodsliveactivity;

/**
 *
 * @author CORESIS_CPE113
 */
public class MethodsLiveActivity {

    public static void main(String[] args) {
        
 double average=calculateavg(90,85,95);
        System.out.println("Your average is " + average);
    }
    static double calculateavg(double prelim, double midterm, double finals){
        double avg = (prelim + midterm + finals) / 3;
        
        if (avg >=90.0){
            System.out.println("A is your grade rating " + "and you have passed.");
        }else if (avg >=85.0 && avg <=89.99){
            System.out.println("B is your grade rating" +" " + "and you have passed.");
        }else if (avg >=80.0 && avg <= 84.99){
            System.out.println("C is your grade rating" +" " + "and you have passed.");
           
        }else if (avg >=75.0 && avg <=79.99){
            System.out.println("D is your grade rating" +" " + "and you have passed.");
        }else{
            System.out.println("F is your grade rating" +" " + "and you have failed.");
        }
          return (avg);      
    }
    
}
            
           
   

  

