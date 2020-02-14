package NewJava;

import javax.swing.*;

public class IITexception {
    public static void main(String[] args) {


        try
        {
            String string =   JOptionPane.showInputDialog("Enter Your Roll Number : ");
            boolean bool = string.contains("BSSE");
            if(bool){
                JOptionPane.showMessageDialog(null,"Batch No : "+string.substring(4,6)+"\n"
                        +"Roll No : "+ string.substring(6,8)+"\n"+"Your email  is : "+string.toLowerCase()+"@iit.du.ac.bd");

            }
            throw new MyException("Please Enter BSSE format");
        }
        catch (MyException ex)
        {

            System.out.println(ex.getMessage());
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

