package src.LabException;

import java.util.Scanner;

public class CalculatorThread {




    public static void main(String[] args) {

        int a,b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Two Number: ");
        System.out.println("Enter a: ");
        a= scanner.nextInt();
        System.out.println("Enter b: ");
        b= scanner.nextInt();

        ThreadObject threadObject = new ThreadObject();

        threadObject.myCalculator(a,b);

    }
}

class ThreadObject{

    public  int add(int a, int b){
        return a+b;
    }
    public  int subtract(int a, int b){
        return a-b;

    }
    public  int multiply(int a, int b){
        return a*b;

    }
    public  double division(int a, int b){

        return Double.valueOf(a/b);
    }

    public  void myCalculator(int a, int b){

        System.out.println("Result of Addition: "+add(a,b));
        System.out.println("Result of Subtraction: "+add(a,b));
        System.out.println("Result of Addition: "+add(a,b));
        System.out.println("Result of Addition: "+add(a,b));

    }

}
