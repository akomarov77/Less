package Lesson14;

import Lesson9.homeWork.Car;
import Lesson9.homeWork.CartState;
import utils.CarUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Lesson9.homeWork.CartState.*;
import static utils.CarUtils.generateCar;

public class Lesson14 {
    static Car isOlderCar(BiPredicate<Car, Car> biPredicateCar, Car p1, Car p2) {
        if (biPredicateCar.test(p1, p2)) {
            System.out.println("Oldest car: " + p1);
            return p1;
        }
        System.out.println("Oldest car: " + p2);
        return p2;
    }

    public static void main(String[] args) {
        List<Car> cars = CarUtils.generateListOfCar(3);
        Car oldestFromTwo = isOlderCar((c1, c2) -> c1.getYear() < c2.getYear(), cars.get(0), cars.get(1));

        System.out.println(cars);

        System.out.println("Bad car: " + cars.stream().filter(car -> car.getCartState() == BAD).findFirst().get());
        System.out.println("2000 year: " +
                cars.stream()
                        .filter(car -> car.getYear() == 2000)
                        .findFirst()
                        .orElse(generateCar())
        );
        cars.stream().forEach(car -> System.out.println(car));
        cars.stream()
                .filter(car -> car.getCartState() == EXCELLENT)
                .forEach(car -> System.out.println(car));

        int year = LocalDateTime.now().getYear();

        long count = cars.stream()
                .peek(car -> System.out.println("peek().. Year: " + car.getYear()))
                .peek(car -> System.out.println("peek().. Manufacturer: " + car.getManufacturer()))
                .filter(car -> car.getCartState() == EXCELLENT)
                .peek(car -> System.out.println("filtered: peek().. Year: " + car.getYear()))
                .peek(car -> System.out.println("filtered: peek().. Manufacturer: " + car.getManufacturer()))
                .count();
        System.out.println("Excellent cars count: " + count);
        cars.stream().filter(c -> c.getCartState() == GOOD)
                .forEach(c -> System.out.println("Man=" + c.getManufacturer() + ": Age= " + (year - c.getYear())));

        boolean hasBadCar = cars.stream().anyMatch(car -> car.getCartState() == BAD);
        String message = hasBadCar ? "We have a bad Car" : " All cars are Ok";
        System.out.println(message);

        boolean allBadCar = cars.stream().allMatch(car -> car.getCartState() == BAD);
        System.out.println(allBadCar ? "All cars are bad" : " Some of cars are Ok");

        boolean have18yearCar = cars.stream().anyMatch(c -> getAge(c) == 18);
        boolean allCarsLess24 = cars.stream().allMatch(c -> getAge(c) < 24);

        System.out.println(have18yearCar ? "We have 18 year Car" : "We don't have 18 year Car");
        System.out.println(allCarsLess24 ? "All cars are younger 24" : " Some of cars are older 24");




        List<CartState> listOfStates = cars.stream()
                .map(car -> car.getCartState())
                .peek(cartState -> System.out.println("Car State from peek: " + cartState))
                .collect(Collectors.toList());
        System.out.println(listOfStates);

        Set<CartState> setOfStates = cars.stream()
                .map(car -> car.getCartState())
                .collect(Collectors.toSet());
        System.out.println(setOfStates);
        System.out.println("===========================================================================");
        Stream<Integer> stream = cars.stream().peek(car -> System.out.println("Car from peek: " + car))
                .map(car -> car.getYear())
                .peek(y -> System.out.println("Car years peek: " + y))
                .map(y -> y + 1000)
                .peek(ny -> System.out.println("New Car years peek: " + ny));

        stream.count();

    }

    private static int getAge(Car car) {
        return LocalDateTime.now().getYear() - car.getYear();
    }
}
