package TH7_CLASSPOINTMOVEABLEPOINT;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println("Điểm di chuyển trước: "+moveablePoint.toString());
        moveablePoint.move();

        System.out.println("Điểm di chuyển sau: "+moveablePoint.toString());

        //test point

        Point point = new Point(4f,6.6f);
        System.out.println("point"+point.toString());
        for (double values: point.getXY()) {
            System.out.println(values + "\t");
        }
    }

}
