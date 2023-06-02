package Assignment3.Problem3;

public final class Rectangle {

    private final double widthOfRectangle;
    private final double lengthOfRectangle;

    public Rectangle(double width, double length) {
        this.widthOfRectangle = width;
        this.lengthOfRectangle = length;
    }

    public double computeArea() {
        return widthOfRectangle * lengthOfRectangle;
    }
}