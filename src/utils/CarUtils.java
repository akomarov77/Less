package utils;

import Lesson9.homeWork.Car;
import Lesson9.homeWork.CartState;
import Lesson9.homeWork.Passenger;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

public class CarUtils {
    public static List<Car> generateListOfCar(int amount) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            result.add(generateCar());
        }
        return result;
    }

    public static Car generateCar() {
        int year = getRandomYear();
        String manufacturer = getManufacturer();
        CartState state = getCarState();
        return new Passenger(year, manufacturer, state);
    }

    public static Car findOneCarByState(CartState state, List<Car> cars) {
/*        Car result = null;
        for (Car car : cars) {
            if (car.getCartState() == state) {
                result = car;
                break;
            }
        }*/
        return cars.stream().filter(car -> car.getCartState() == state).findFirst().get();
    }

    private static int getRandomYear() {
        return (int) ((Math.random() * 25) + 1990);
    }

    private static String getManufacturer() {
        return UUID.randomUUID().toString();
    }

    private static CartState getCarState() {
        int randomState = (int) (Math.random() * 3);
        return CartState.values()[randomState];
    }
}
