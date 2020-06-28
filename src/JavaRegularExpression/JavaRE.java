package src.JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRE {

    public static void main(String[] args) {
        String statement = new String("Institute of Information Technology");
        String  patternString =  "I{1,2}";
        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(patternString);
        System.out.println(matcher.find()?"Well Done" : "We are failed");
    }
}
