package src.JavaRegularExpression;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesFindDifferent {

    public static void main(String[] args) {
        String matchString = "university of dhaka";
        String findString1 = "notre dame college";
        String findString2 = "iitDU";
        String findString3 = "iitdu@.ac.bd";

        String matchPattern="[a-z ]+";
        String findPattern = "^[a-z]$";
        Pattern patternMatch = Pattern.compile(matchPattern);
        Pattern patternFind = Pattern.compile(findPattern);

        Matcher matcherMatch = patternMatch.matcher(matchString);
        Matcher matcherFind = patternFind.matcher(findString1);

        System.out.println("Result 1 : "+matcherMatch.matches());
        System.out.println("Result 2 : "+matcherFind.find());

    }
}
