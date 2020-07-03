package src.JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameLAstNameChecker {
    public static void main(String[] args) {

        String firstNamePattern ="[A-Z][a-z]+";
        String lastNamePattern = "[A-Z]+([ '-][A-Z])*[a-z]*";

        String userFirstName ="Rakib";
        String userLastName = "Trofder";

        Pattern patternFirstName = Pattern.compile(firstNamePattern);
        Pattern patternLastName = Pattern.compile(lastNamePattern);

        Matcher matcherFirstName = patternFirstName.matcher(userFirstName);
        Matcher matcherLastName = patternLastName.matcher(userLastName);

        System.out.println(matcherFirstName.matches()? "Your first name is correct." :"Your first name is wrong!!!");
        System.out.println(matcherLastName.matches() ?"Your last name is correct." : "Your last name is wrong!!!" );
    }
}
