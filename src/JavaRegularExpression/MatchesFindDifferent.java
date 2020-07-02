package src.JavaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesFindDifferent {

    public static void main(String[] args) {
        String matchString = "university of dhaka";
        String findString = "notre dame college";
        String matchPattern="[a-z ]+";
        Pattern pattern1 = Pattern.compile(matchPattern);
        Pattern pattern2 = Pattern.compile(findString);

        Matcher matcher = pattern1.matcher(matchString);

    }
}
