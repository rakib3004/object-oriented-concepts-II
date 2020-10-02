package src.SoftwareDesignPrinciples;

import java.util.ArrayList;

public class Main {

    public void  createCSV(){

EarthQuakeParser earthQuakeParser = new EarthQuakeParser();
String source = "m http://earthquake.usgs.gov";
        ArrayList<Integer> list = earthQuakeParser.read(source);
        dumpCSV(list);
        System.out.println("# quakes read : "+list.size());
    }
    public  void dumpCSV(ArrayList<Integer> list){

    }
}
