package src.SoftwareDesignPrinciples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


EarthQuakeParser earthQuakeParser = new EarthQuakeParser();
String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list = earthQuakeParser.read(source);
        dumpCSV(list);
        System.out.println("# quakes read : "+list.size());
        for(QuakeEntry quakeEntry : list){
if(quakeEntry.getMagnitude()>5.0){
    System.out.println(quakeEntry);
}
        }
    }
    public static void dumpCSV(ArrayList<QuakeEntry> list){

    }
}
