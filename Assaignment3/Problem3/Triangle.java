package Assignment3.Problem3;

public final class Triangle {
    private final double baseTr;
    private final double heightTr;

    public Triangle(double base, double height) {
        this.baseTr = base;
        this.heightTr = height;
    }

    public double computeArea() {
        return (baseTr * heightTr) / 2;
    }
}