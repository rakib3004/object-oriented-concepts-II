package src.CourseraProjectNetwork;

public class Pet {
    
    // properties:
    
    // Task 5: Step 3: change to "protected"
    // Task 1: add two properties:
    
    protected String name = "";
    protected int age = 0;
    
    // Task 3: add priviate property ageMultiplier (int)
    private int ageMultiplier = 1;
    
    // constructor
    
    public Pet(String someName, int someAge) {
        // task 1: assign the parameters to the properties name and age
        name = someName;
        age = someAge;
    }
    
    // Task 3: add another constructor that takes an additional parameter
    // someMultiplier (int) and assign it to the property ageMultiplier
    public Pet(String someName, int someAge, int someMultiplier) {
        name = someName;
        age = someAge;
        ageMultiplier = someMultiplier;
    }
    
    // methods
    
    public String selfDescribe() {
 
        // Task 3: calculate the real age and include it to the string
        return "Hello, my name is " + name + ". I am " + calculateRealAge() + " in human years.";
    }
    
    // Task 3: add a method calculateRealAge()
    
    public int calculateRealAge() {
        return age * ageMultiplier;
    }
    
}
