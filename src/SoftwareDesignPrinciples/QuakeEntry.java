package src.SoftwareDesignPrinciples;

public class QuakeEntry {
private Location location;
private String title;
    private double depth;
private double magnitude;

    public QuakeEntry(Location location, String title, double depth, double magnitude) {
        this.location = location;
        this.title = title;
        this.depth = depth;
        this.magnitude = magnitude;
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
