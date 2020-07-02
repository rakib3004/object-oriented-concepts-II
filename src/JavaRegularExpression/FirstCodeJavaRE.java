package src.JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstCodeJavaRE {

    public static void main(String[] args) {
        String statement = "Welcome to BSSE 8th Batch";
        String  patternString =  "S{2,8}";
        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(patternString);
        System.out.println(matcher.find()? "Well Done" : "We are failed");
    }
}
