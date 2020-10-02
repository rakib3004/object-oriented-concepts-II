package src.SoftwareDesignPrinciples;

public class QuakeEntry {

    private Location location;
private String title;
    private double depth;



    private double magnitude;

    public QuakeEntry(double lat, double lon, String title, double depth, double magnitude) {
        this.location = new Location(lat,lon);
        this.title = title;
        this.depth = depth;
        this.magnitude = magnitude;
    }
    public double getMagnitude() {
        return magnitude;
    }
    public Location getLocation() {
        return location;
    }
    public double getDepth() {
        return depth;
    }
    public String getInfo(){
        return "This is a earth-quake";
    }
static class Location {

    private double location1;
private  double location2;

    public Location(double location1, double location2) {
        this.location1 = location1;
        this.location2 = location2;
    }

}
}
