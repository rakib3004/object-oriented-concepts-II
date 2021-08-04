package src.RollNoException;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
int array[] = new int[]{1,2,3,4,5};

     //   Scanner scanner = new Scanner(System.in);

try{
  //  int integer = scanner.nextInt();
   String string= JOptionPane.showInputDialog(null,"Enter a number (must be an integer)");
int  integer = Integer.parseInt(string);
    System.out.println(array[integer]);

}catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
    JOptionPane.showMessageDialog(null,"Array Size "+array.length+ "!!!");
      System.out.println("Array index limit go through the out of bounds");

}catch (NullPointerException nullPointerException){
    JOptionPane.showMessageDialog(null,"There is no input you provides");

}catch (InputMismatchException inputMismatchException){
    JOptionPane.showMessageDialog(null,"String is not excepted!!!");
    System.out.println("Please input a integer value");


}catch (NumberFormatException numberFormatException){
    JOptionPane.showMessageDialog(null,"Number format is not valid");
}
catch (Exception exception){
    JOptionPane.showMessageDialog(null,"Some functionality is not work properly");

}
    }
}
