package src.JavaRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheckerJavaRE {

    public static void main(String[] args) {

        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+*&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}";
        String emailName = "bsse1129@iit.du.ac.bd"; // this email address is correct

        System.out.println("Enter your  Email address : ");

        Scanner scanner = new Scanner(System.in);
        emailName = scanner.nextLine();


        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(emailName);
       boolean bool = matcher.find();
       boolean aBool = !bool;
       String boolString = Boolean.toString(bool);
       boolString = boolString.toUpperCase();
  //      System.out.println(boolString);\
        System.out.println(bool? "Email address is correct":"Email address is wrong");

    }
}
