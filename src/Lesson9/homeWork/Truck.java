package Lesson9.homeWork;

public class Truck extends Car {
    private int bearing;

    private Truck() {
        super();
    }

    public Truck(int year, String manufacturer, CartState cartState) {
        super(year, manufacturer, cartState);
    }

    public int getBearing() {
        return bearing;
    }
}
