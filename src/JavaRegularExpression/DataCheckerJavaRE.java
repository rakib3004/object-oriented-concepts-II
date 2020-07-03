package src.JavaRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataCheckerJavaRE {
    RegularExpressionClass regularExpressionClass = new RegularExpressionClass();
    public static void  main(String[] args) {
int chooseOption;
        System.out.println("What do you want???");
        System.out.println("1.First Name Check");
        System.out.println("2.Last Name Check");
        System.out.println("3.Email Check");
        System.out.println("4.Phone Number Check");
        System.out.println("5.Password Check");
Scanner scanner = new Scanner(System.in);
chooseOption = scanner.nextInt();
if(chooseOption==1){
    firstNameChecker();
}


    }
public static void firstNameChecker(){
    System.out.println("Hiiiiiiiiiiiiiiiiiiiii");

}public static void lastNameChecker(){

}public static void EmailChecker(){

}public static void PhoneNumberChecker(){

}public static void PasswordChecker(){

}

}
class RegularExpressionClass {
    public void regularExpressionClassMethods(String patternString,String testingString){
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(testingString);
        boolean bool = matcher.matches();
        System.out.println(bool?"Your given Data is successfully matches" : "Your given data is failed to match");
    }
}