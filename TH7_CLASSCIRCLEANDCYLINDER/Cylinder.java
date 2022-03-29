package TH7_CLASSCIRCLEANDCYLINDER;

public class Cylinder extends Circle {
    public double height;

    public Cylinder () {
        this.height = 10;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*Math.pow(getRadius(),2)*getHeight();
    }

    public String toString() {
        return "Cylinder have {" +
                "radius=" + getRadius() + "and "+
                ", color is ='" + getColor() + '\'' +
                '}'+"have height " +getHeight()+ "Volume "+getVolume();
    }
}
