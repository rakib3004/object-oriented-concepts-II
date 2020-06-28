package src.OOP_File_IO;

import src.LabException.Circle;
import src.LabException.InvalidRadiusException;

class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);   c1.setRadius(-5);
            Circle c2 = new Circle(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println("Invalid Radius: " + ex.getRadius());
        }

        System.out.println("Number of objects created: " +
                Circle.getNumberOfObjects());
    }
}
