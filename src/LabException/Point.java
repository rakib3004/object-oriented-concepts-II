package src.LabException;

import java.awt.*;

public class Point {

    private int x,y;

    public Point(int x ,int y){
        this.x =x;
        this.y =y;
    }

    public Point(){
        this(0,0);
    }

    public class ColoredPoint extends Point{
        private Color color;

        public  ColoredPoint(int x, int y, Color color){
            super(x,y);
            this.color=color;
        }
        public ColoredPoint(int x, int y){
            System.out.println("Initializes all the variables");
           // this(x,y);  // point with default value
        }

    }

}
