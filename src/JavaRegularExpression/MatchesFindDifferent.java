package src.JavaRegularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesFindDifferent {

    public static void main(String[] args) {
        String matchString = "    ";
        String findString1 = "notre dame college";
        String findString2 = "@#$%%#";
        String findString3 = "iitdu@.ac.bd";
        String findString4 = "-----===aaa==-------";

        String matchPattern="[a-z ]+";
        String findPattern = "[^a-z]$";
        Pattern patternMatch = Pattern.compile(matchPattern);
        Pattern patternFind = Pattern.compile(findPattern);

        Matcher matcherMatch = patternMatch.matcher(matchString);
        Matcher matcherFind = patternFind.matcher(findString2);

        System.out.println("Matching Result : "+matcherMatch.matches());
        System.out.println("Fining Result : "+matcherFind.find());

    }
}
