package src.LabException;

import java.util.Scanner;

public class CalculatorThread {


    public static void main(String[] args) {

        ThreadObject threadObject = new ThreadObject();
        threadObject.inputOutputStream();

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
    public  double divide(int a, int b){

        return Double.valueOf(a)/Double.valueOf(b);
    }

    public  void myCalculator(int a, int b){

        System.out.println("Result of Addition: "+add(a,b));
        System.out.println("Result of Subtraction: "+subtract(a,b));
        System.out.println("Result of Multiplication: "+multiply(a,b));
        System.out.println("Result of Division: "+divide(a,b));

    }

    public void inputOutputStream(){

        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("Enter Two Number: ");
        System.out.print("Enter a: ");

        try{
            a= scanner.nextInt();
            System.out.print("Enter b: ");
            b= scanner.nextInt();

           myCalculator(a,b);
        }
        catch (Exception exception){
            System.out.println("Occur Some Problem!!\n Try again!");
            inputOutputStream();
        }


    }

}
