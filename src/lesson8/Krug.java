package lesson8;

public class Krug implements WithPerimetr {
    private int radius;

    public Krug(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculatePerimetr() {
        return (int) (radius * WithSquare.MY_PI);
    }

    @Override
    public double calculateSquare() {
        return radius * radius * WithSquare.MY_PI;
    }

    public void printFromKrug() {
    }
}
