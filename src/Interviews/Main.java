package src.Interviews;

class PassByValue{
    public PassByValue() {
    }

    public void changeValue(int x) {

        System.out.println("experiment "+x);
    }

    public void  run(){
         int  num = 10;

        changeValue(num);

        System.out.println(num);
    }

}
public class Main {


    public static void main(String[] args) {

PassByValue passByValue = new PassByValue();
passByValue.run();



    }
}
