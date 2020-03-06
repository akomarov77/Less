package lesson7;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculatePerim() {
        double result = 0;

        double ab = Math.sqrt(
                Math.pow((this.b.getX() - this.a.getX()), 2.0)
                        + Math.pow((this.b.getY() - this.a.getY()), 2.0)
        );
        double bc = Math.sqrt(
                Math.pow((this.c.getX() - this.b.getX()), 2.0)
                        + Math.pow((this.c.getY() - this.b.getY()), 2.0)
        );
        double ac = Math.sqrt(
                Math.pow((this.c.getX() - this.a.getX()), 2.0)
                        + Math.pow((this.c.getY() - this.a.getY()), 2.0)
        );
        result = ab + bc + ac;
        return result;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
