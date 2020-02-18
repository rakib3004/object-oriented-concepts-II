package NewPackage;

public class Circle {
    private double radius;
    private static int numberOfObjects = 0;

    public Circle() throws InvalidRadiusException{    this(1.0);   }
    public Circle(double newRadius) throws InvalidRadiusException{
        setRadius(newRadius); numberOfObjects++;
    }

    public void setRadius(double newRadius)
            throws InvalidRadiusException {
        if (newRadius >= 0)      radius =  newRadius;
        else throw new InvalidRadiusException(newRadius);
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
