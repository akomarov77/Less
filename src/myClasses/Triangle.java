package myClasses;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        arePositive(a, b, c);
        isValid(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private void arePositive(int a, int b, int c) {
        isPositive(a);
        isPositive(b);
        isPositive(c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    private void isPositive(int paramName) {
        if (paramName > 0) {
            System.out.println("Your triangle is Ok");
        } else {
            System.out.println("Sides length are incorrect!!!");
            throw new IllegalArgumentException();
        }
    }
    private void isValid(int a, int b, int c) {
        if (a + b > c && b + c > a) {
            System.out.println("Your triangle is Ok");
        } else {
            System.out.println("Sides length are incorrect!!!");
            throw new IllegalArgumentException();
        }
    }

    public void setA(int a) {
        isPositive(a);
        this.a = a;
    }

    public void setB(int b) {
        isPositive(b);
        this.b = b;
    }

    public void setC(int c) {
        isPositive(c);
        this.c = c;
    }

    public int calculatePerimetr() {
        int result = this.a + this.b + this.c;
        return result;
    }
}
