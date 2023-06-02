package Assignment3.Problem3;

public final class Circle {
    private final double radiusOfCircle;

    public Circle(double radius) {
        this.radiusOfCircle = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(this.radiusOfCircle, 2);
    }
}
