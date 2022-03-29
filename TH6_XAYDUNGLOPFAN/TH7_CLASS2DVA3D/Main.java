package TH6_XAYDUNGLOPFAN.TH7_CLASS2DVA3D;

public class Main {
    public static void main(String[] args) {
        POINT2D point = new POINT2D(5.4f, 5.5f);
        System.out.println(point.toString()+"\n");

        POINT3D newPoint3D = new POINT3D(5.4f, 7.8f,6.7f);
        System.out.println("Point3D "+ newPoint3D.toString());
        for (double values: newPoint3D.getXYZ()) {
            System.out.println(values + "\t");
        }
    }
}
