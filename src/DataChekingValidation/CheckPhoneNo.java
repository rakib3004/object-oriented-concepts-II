package src.DataChekingValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternModel;

        patternModel = "^([+]88)?[01][0-9&&[^012]][0-9]{8}$";
        Pattern pattern = Pattern.compile(patternModel);

        String emailAddress;
        emailAddress="TestEmail";

        int testValue=1;
        while(testValue!=0){
            System.out.println("Enter Your Phone Number:");
            emailAddress = scanner.nextLine();
            if(emailAddress=="\n"){
                testValue=0;
            }
            else {
                Matcher matcher = pattern.matcher(emailAddress);
                System.out.println(matcher.find()? "Phone Number Okay.":"Error!!");

            }
        }

     /*

     ^(b|m)sse(0[1-9]|[1-9][0-9])(0[1-9]|[1-9][0-9])@iit.du.ac.bd$
      */

    }
}
