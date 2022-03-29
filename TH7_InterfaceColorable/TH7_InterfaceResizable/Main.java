package TH7_InterfaceColorable.TH7_InterfaceResizable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(4.5);
        shape[1] = new Rectangle(7.5,5.6);
        shape[2] = new Square(10.2);

        System.out.println("Area of Shape");
        for (Shape elements: shape) {
            System.out.println(elements.getArea());
            if (elements instanceof Square) {
                System.out.println("shape square has a Colorable");
                ((Square) elements).howToColor();
            }
        }

    }

}
