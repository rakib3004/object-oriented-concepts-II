

import javax.swing.*;

public class IITexception {
    public static void main(String[] args) {


        try
        {
            String string =   JOptionPane.showInputDialog("Enter Your Roll Number : ");
            String check = string.substring(0,4);

            boolean bool = check.equals("BSSE");
            boolean bool1=bool;
            for(int i=4;i<8;i++){

                bool = (string.charAt(i)<='9'&& string.charAt(i)>='0');
              bool1 = bool1 & bool;
            }
            if(bool1){
                JOptionPane.showMessageDialog(null,"Batch No : "+string.substring(4,6)+"\n"
                        +"Roll No : "+ string.substring(6,8)+"\n"+"Your email  is : "+string.toLowerCase()+"@iit.du.ac.bd");

            }
            else
            throw new MyException("Please Enter roll at BSSE format && put right roll no .");
        }
        catch (MyException ex)
        {
JOptionPane.showMessageDialog(null,ex.getMessage());

        }




    }
}
class MyException extends Exception
{
    public MyException(String string)
    {
        super(string);
    }
}