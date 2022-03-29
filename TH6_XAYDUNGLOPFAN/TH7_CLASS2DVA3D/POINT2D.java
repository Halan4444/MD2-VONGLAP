package TH6_XAYDUNGLOPFAN.TH7_CLASS2DVA3D;

public class POINT2D {
    private float x;
    private float y;

    public POINT2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public POINT2D () {

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

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
        return new float[] {this.x, this.y};
    }

    public String toString(){
        return getX() + "," + getY();
    }

}
