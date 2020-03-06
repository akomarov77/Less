package Lesson9.homeWork;

public class AutoSalonImpl implements AutoSalon {

    public AutoSalonImpl(int balance) {
        this.balance = balance;
    }

    private int balance;
    private Car[] parking = new Car[8];

    @Override
    public int buyCar(Car carToBuy) {
        int freePlace = getFreePlace();
        if (freePlace < 0) {
            System.out.println("Don't have free places, please sell smth.");
            return -1;
        }
        int price = 0;

        if (carToBuy instanceof Truck) {
            Truck truck = (Truck) carToBuy;
            int bearing = truck.getBearing();
            int state = truck.getCartState().getRate();
            int year = truck.getYear();
            price = bearing * state * year;
        }

        if (carToBuy instanceof Passenger) {
            Passenger passenger = (Passenger) carToBuy;
            //TODO ...
        }
        if (balance < price) {
            System.out.println("Don't have enough money, please sell smth.");
            return -1;
        }
        balance -= price;
        parking[freePlace] = carToBuy;
        return price;
    }

    @Override
    public void sellCar(int parkingSlot) {


    }

    @Override
    public void report() {

    }

    private int getFreePlace() {
        int freePlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freePlace = i;
            }
        }
        return freePlace;
    }
}
