package src.JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPositionJavaRE {
    public static void main(String[] args) {
        String newString = "You should search bsse@iit.du.ac.bd #besafe";
        String patterIs = " +#{1}";
        Pattern pattern =  Pattern.compile(patterIs);

        Matcher matcher = pattern.matcher(newString);
        if(matcher.find()){

            System.out.println("My Regression is start at  "+matcher.start());
            System.out.println("My Regression is start at  "+matcher.end());

        }
        String line = "tusar0805iitdu";

        String pattern1 ="[a-z]+";

        int count = 0;

        Pattern r = Pattern.compile(pattern1);

        Matcher m = r.matcher(line);

        while(m.find()) {

            count++;

            System.out.println("Match number "+count);

            System.out.println("start(): "+m.start());

            System.out.println("end(): "+m.end());

            System.out.println(line);

        }

    }
}
