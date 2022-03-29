package TH7_CLASSCIRCLEANDCYLINDER;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.toString()+"\n");

        Circle circle2 = new Circle();
        circle2.setRadius(100);
        circle2.setColor("green");
        System.out.println(circle2.toString()+"\n");


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.toString()+"\n");

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setHeight(30);
        cylinder2.setColor("blue");
        cylinder2.setRadius(30);
        System.out.println(cylinder2.toString());
    }

}
