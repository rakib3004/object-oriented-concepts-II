package src.LabException;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iit
 */
public class Circle {
    
    	private double radius;
	private static int numberOfObjects = 0;
	
	public Circle() throws InvalidRadiusException 
        {    
            this(1.0);   
        }
        
	public Circle(double newRadius) throws InvalidRadiusException{
	    setRadius(newRadius); numberOfObjects++; 
	}

	public void setRadius(double newRadius)
		      throws InvalidRadiusException {
	    if (newRadius >= 0)      
                radius =  newRadius;
            
	    else throw new InvalidRadiusException(newRadius);
  	}
        
        public double getArea(){
            return Math.PI * Math.pow(radius, 2);
        }
                
	public static int getNumberOfObjects() { 
		return numberOfObjects;
	}
    
}
