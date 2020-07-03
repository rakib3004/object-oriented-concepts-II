package src.JavaRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheckerJavaRE {
    public static void main(String[] args) {
      //  String passwordPattern0 = "[A-Z]+[a-z]+[0-9]+";
        String passwordPattern = "[.[a-z].[A-z].[0-9]]{8,}";
        String passwordString ="Rakib1129";
       /* Scanner scanner = new Scanner(System.in);
        passwordPattern = scanner.nextLine();*/

        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(passwordString);
        boolean bool = matcher.find();
        boolean aBool;
        aBool = !bool;
        String boolString = Boolean.toString(bool);
        boolString = boolString.toUpperCase();
        System.out.println(boolString);
    }
}
