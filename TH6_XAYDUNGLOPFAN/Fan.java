package TH6_XAYDUNGLOPFAN;

public class Fan {
    private int speed;
    private double radius;
    private String color;
    private boolean onOff;

    public Fan() {
        this.speed = 1;
        this.radius = 5d;
        this.color = "blue";
        this.onOff = true;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public String fanInfo() {
            if(this.isOnOff()==true) {
                return "Fan" + "\n Color: " + this.color + "\n Speed: " +this.speed + "\n Radius: " + this.radius
                        + "\n Fan is On";
            }
            return "Fan" + "\n Color:" + this.color + "\n Radius: " + this.radius + "\n Fan is Off";
    }
}
