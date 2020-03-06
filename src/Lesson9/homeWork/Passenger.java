package Lesson9.homeWork;

public class Passenger extends Car {
    private int places;

    public String ownerName;

    public Passenger() {
        super(0, null, null);
    }

    public Passenger(int year, String manufacturer, CartState cartState) {
        super(year, manufacturer, cartState);
    }

    public int getPlaces() {
        return places;
    }

    private void secretMethod(){
        System.out.println("Tssssss");
    }
}
