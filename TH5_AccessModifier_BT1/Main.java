package TH5_AccessModifier_BT1;

public class Main {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        cir1.setRadius(25);
        cir1.setColor("");
        System.out.println("Area I is: "+cir1.getArea());
        System.out.println("Color is: "+ cir1.getColor());

        Circle cir2 = new Circle(5);
        System.out.println("Area II is: "+cir2.getArea());

    }
}
