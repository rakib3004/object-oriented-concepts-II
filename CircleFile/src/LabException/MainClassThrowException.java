/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabException;

/**
 *
 * @author iit
 */
public class MainClassThrowException {
    
      public static void main(String[] args) {
    try {
      Circle c1 = new Circle(-5);   c1.setRadius(-5);
      Circle c2 = new Circle(0);
    }
    catch (InvalidRadiusException ex) { 
	System.out.println("Invalid Radius: " + ex.getRadius());     
    }

    System.out.println("Number of objects created: " +
      				Circle.getNumberOfObjects());
  }
    
}
