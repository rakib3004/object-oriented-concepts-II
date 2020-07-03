package src.JavaRegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCheckerJavaRE {
    public static void main(String[] args) {
        String phoneNumberPattern = "01[3-9][0-9]{8}";
        String phoneNumberExample = "01911803004";

        Scanner scanner = new Scanner(System.in);
        phoneNumberExample = scanner.nextLine();

        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumberExample);
        boolean bool = matcher.find();
        boolean aBool = !bool;
        String boolString = Boolean.toString(bool);
        boolString = boolString.toUpperCase();
      //  System.out.println(boolString);

        System.out.println(bool?"Phone number is correct" : "Phone number is not correct");
    }
}
