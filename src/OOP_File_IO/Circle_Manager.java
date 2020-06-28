package src.OOP_File_IO;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import src.LabException.Circle;
import src.LabException.InvalidRadiusException;
import src.OOP_File_IO.Test_File;

import java.util.ArrayList;

/**
 *
 * @author iit
 */
public class Circle_Manager {
    
    public void create_circle_manager(){
        Test_File readFromFileObject = new Test_File();
        
        ArrayList<Circle> arrayList_of_Circle = new ArrayList<>();
        
        ArrayList<String> arrayList_of_Radius = 
                readFromFileObject.readFromFile_BufferReader("circle.txt");
        
        for (String radius : arrayList_of_Radius) {
            
            System.out.println("Radious is " + radius);
            double original_radius = Double.parseDouble(radius);
            
            try {
                Circle dummy_circle = new Circle(original_radius);
                arrayList_of_Circle.add(dummy_circle);
                
            } catch (InvalidRadiusException ex) {
                System.out.println("Problem in Radius " + ex);
            } 
        }
        
        for (Circle dummy_circle : arrayList_of_Circle) {
            System.out.println("Area is " + dummy_circle.getArea());
        }
    }
    
}
