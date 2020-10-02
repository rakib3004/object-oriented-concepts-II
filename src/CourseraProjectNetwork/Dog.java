
package src.CourseraProjectNetwork;

// Task 2: inhert from the Pet class 
public class Dog extends Pet {
    
    // constructor
    
    // Task 2: add someName and someAge to the constructor
    
    public Dog(String someName, int someAge) {

        // Task 2: call constructor of ancestor class Pet
        // Task 3: add multiplier 7 to constructor call
        super(someName, someAge, 7);
    }
    
    // methods  
    
    // Task 4: Override selfDescribe() from ancester class.
    //         Call ancester's selfDescribe() then
    //         Add text "Fun dog looking to make friends! " to string returned

    @Override public String selfDescribe() {
        return "Fun dog looking to make friends! " + super.selfDescribe();
    }
}
