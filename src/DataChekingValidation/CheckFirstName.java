package src.DataChekingValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFirstName {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternModel;

        patternModel = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(patternModel);

        String firstName;
            firstName="Testname";

           int testValue=1;
        while(testValue!=0){
            System.out.println("Enter Your Name:");
            firstName = scanner.nextLine();
            if(firstName=="\n"){
                testValue=0;
            }
            else {
                Matcher matcher = pattern.matcher(firstName);
                System.out.println(matcher.find()? "Successful Login":"Login Unsuccessful!!!!");

            }
        }
    }
}
