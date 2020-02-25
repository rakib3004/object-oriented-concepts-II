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
public class InvalidRadiusException extends Exception{
    
    	private double radius;
	public InvalidRadiusException() 
        { 
            super("invalid radius!"); 
        }
	public InvalidRadiusException(double radius) {
	    super("Invalid radius "); 
            this.radius = radius;
	}
	public double getRadius() { return radius; }	
    
}
