package TH7_InterfaceResizable;

public class Main {
    public static void main(String[] args) {
        Shape [] shape = new Shape[3];
        shape[0] = new Circle(4.5, "green", true);
        shape[1] = new Rectangle (7.5,5.6, "red", true);
        shape[2] = new Square (10.2, "indigo", true);

        System.out.println("Before");
        for (Shape elements: shape) {
            System.out.println(elements.toString());
        }
        System.out.println("After");
        for (Shape elements: shape) {
            double randomNumber = 10;
            elements.resize(randomNumber);
            System.out.println(elements.toString());
        }
    }

}
