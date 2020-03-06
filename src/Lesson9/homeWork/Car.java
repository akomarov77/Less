package Lesson9.homeWork;

public abstract class Car {
    private int year;
    private String manufacturer;
    private CartState cartState;

    public Car() {
    }

    public Car(int year, String manufacturer, CartState cartState) {
        this.year = year;
        this.manufacturer = manufacturer;
        this.cartState = cartState;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", cartState=" + cartState +
                '}';
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public CartState getCartState() {
        return cartState;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCartState(CartState cartState) {
        this.cartState = cartState;
    }
}
