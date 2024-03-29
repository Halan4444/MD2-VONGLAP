package TH7_CLASSCOMPARATOR.TH7_CLASSCOMPARABLE;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted");
        for (Circle circle: circles) {
            System.out.println(circle);
        }
        Comparator comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles, comparatorCircle);

        System.out.println("After sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }
}
