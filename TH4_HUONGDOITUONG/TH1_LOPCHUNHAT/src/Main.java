import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();

        Rectangle retangle = new Rectangle(width,height);

        System.out.println("Your Rectangle \n"+retangle.display());
        System.out.println("Perimeter of the Rectangle: " + retangle.getPerimeter());
        System.out.println("Area if the Regtangle: " + retangle.getPerimeter());
    }
}
