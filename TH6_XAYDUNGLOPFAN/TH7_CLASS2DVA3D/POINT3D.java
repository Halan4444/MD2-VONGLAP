package TH6_XAYDUNGLOPFAN.TH7_CLASS2DVA3D;

public class POINT3D extends POINT2D {
    public float z;

    public POINT3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public POINT3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }
    public float [] getXYZ () {
        return new float[] {super.getX(),super.getY(),this.z};
    }
    public String toString() {
        return super.toString() + "," + this.getZ();
    }

}
