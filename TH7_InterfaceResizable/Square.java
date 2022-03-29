package TH7_InterfaceResizable;

public class Square extends Shape implements Colorable{
    private double side = 1.0;

    public Square() {
    }



    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square(double v, String indigo, boolean b) {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "A Square with side = " +
                "side=" + getSide() +
                " which is a subclass of " + super.toString()+" "+this.howtoColor() + '}';
    }


    @Override
    public String howtoColor() {
        return "Color all four side...";
    }

    @Override
    public void resize (double percent) {
        this.side = (this.side*(percent/100));
    }
}
