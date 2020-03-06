package lesson7;

public abstract class Shape {
    public abstract int calculatePerim();

    protected int side;

    protected void printFromAbstract() {
        System.out.println("Print From Abstract!");
    }
}
