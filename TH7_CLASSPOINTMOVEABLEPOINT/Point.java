package TH7_CLASSPOINTMOVEABLEPOINT;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point () {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float [] getXY() {
        return new float[]{this.x,this.y};
    }

    public String toString() {
        return "Point{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }
}
