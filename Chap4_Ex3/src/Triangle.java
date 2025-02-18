public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this(1, 1, 1);

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            throw new IllegalTriangleSideException("Invalid sides!");
        }

    }
}
