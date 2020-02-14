package NewJava;

import javax.swing.*;

public class IITexception {
    public static void main(String[] args) {
String a = "BSSE1129";
       /* System.out.println(a);
        a= a.toLowerCase();
        System.out.println(a);*/
            String string =   JOptionPane.showInputDialog("Enter Your Roll Number : ");
boolean bool = string.contains("BSSE");
if(bool){
    JOptionPane.showMessageDialog(null,"Your roll no is : "+string);
    JOptionPane.showMessageDialog(null,"Your email  is : "+string.toLowerCase()+"@iit.du.ac.bd");

}


    }
}
