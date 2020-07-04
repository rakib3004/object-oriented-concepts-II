package src.JavaRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataCheckerJavaRE {
    static RegularExpressionClass regularExpressionClass = new RegularExpressionClass();
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
else if(chooseOption==2){
    lastNameChecker();
}else if(chooseOption==3){
    emailChecker();
}else if(chooseOption==4){
    phoneNumberChecker();
}else if(chooseOption==5){
    passwordChecker();
}

    }
public static void firstNameChecker(){
    String firstNamePattern ="[A-Z][a-z]+";
    String userFirstName ="Rakib";// this first name is correct
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first name : ");
    userFirstName = scanner.nextLine();
    regularExpressionClass.regularExpressionClassMethods(firstNamePattern,userFirstName);
}public static void lastNameChecker(){
        String lastNamePattern = "[A-Z]+([ '-][A-Z])*[a-z]*";
        String userLastName = "Trofder"; // this last name is correct
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your  last name : ");
        userLastName = scanner.nextLine();
        regularExpressionClass.regularExpressionClassMethods(lastNamePattern,userLastName);

}public static void emailChecker(){
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+*&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}";
        String emailName = "bsse1129@iit.du.ac.bd"; // this email address is correct
        System.out.println("Enter your  Email address : ");
        Scanner scanner = new Scanner(System.in);
        emailName = scanner.nextLine();
        regularExpressionClass.regularExpressionClassMethods(emailPattern,emailName);

    }public static void phoneNumberChecker(){
        String phoneNumberPattern = "01[3-9][0-9]{8}";
        String phoneNumberExample = "01911803004";// this phone number is correct
        System.out.println("Enter your phone number : ");
        Scanner scanner = new Scanner(System.in);
        phoneNumberExample = scanner.nextLine();
        regularExpressionClass.regularExpressionClassMethods(phoneNumberPattern,phoneNumberExample);

    }public static void passwordChecker(){
        String passwordPattern = "[.[a-z].[A-z].[0-9]]{8,}";
        String passwordString ="Rakib1129";//this password is correct
        System.out.println("Enter your password : ");
        Scanner scanner = new Scanner(System.in);
        passwordPattern = scanner.nextLine();
        regularExpressionClass.regularExpressionClassMethods(passwordPattern,passwordString);

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