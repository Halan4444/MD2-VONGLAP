package TH7_CLASSTRIANGLE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;

        boolean isSideOfTriangle = false;
        do {
            System.out.print("Enter the first side of triangle: ");
            side1 = Double.parseDouble(sc.nextLine());
            System.out.print("Enter the second side of triangle: ");
            side2 = Double.parseDouble(sc.nextLine());
            System.out.print("Enter the third side of triangle: ");
            side3 = Double.parseDouble(sc.nextLine());
            isSideOfTriangle = (side1+side2>side3) && (side2+side3>side1)&&(side1+side3>side2);
            if (isSideOfTriangle) {
                break;
            } else {
                System.out.println("3 number entered is not sides of triangle ");
            }
        } while (true);

        System.out.println("Enter the color of triangle: ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(color,side1,side2,side3);
        System.out.println(triangle);
    }
}
