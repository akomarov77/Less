package Lesson9.homeWork;

public class Main {


    public static void main(String[] args) {
        AutoSalon autoSalon = new AutoSalonImpl(40_000);
        Passenger toyota = new Passenger(123, "RR", CartState.EXCELLENT);
        Truck scania = new Truck(123, "RR", CartState.EXCELLENT);

        autoSalon.buyCar(toyota);
        autoSalon.buyCar(scania);
        autoSalon.report();

        autoSalon.sellCar(4);
        autoSalon.sellCar(2);
        autoSalon.report();
    }
}
