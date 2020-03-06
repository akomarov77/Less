package lesson8;

public class Kvadrat implements WithPerimetr {
    private int side;

    public Kvadrat(int side) {
        this.side = side;
    }


    @Override
    public int calculatePerimetr() {
        return this.side * 4;
    }

    public void printFromKvadrat() {

    }

    @Override
    public double calculateSquare() {
        return side * side;
    }
}
