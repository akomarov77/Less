package lesson12;

import Lesson11.generic.Citizen;
import Lesson11.generic.Employee;
import Lesson11.generic.Person;
import Lesson9.homeWork.Car;
import Lesson9.homeWork.CartState;
import Lesson9.homeWork.Passenger;

import java.util.HashMap;
import java.util.Map;

public class Lesson12 {
    public static void main(String[] args) {
        Map<String, Citizen> people = new HashMap<>(20);
        Citizen p1 = new Citizen(43, "Nik");
        Citizen p2 = new Citizen(12, "Mike");
        Person p3 = new Employee(34, "Jo");
        Person p4 = new Employee(55, "Jay");
        people.put(p1.getName(), p1);
        people.put(p2.getName(), p2);
        //people.put(p3.getName(), p3);
        //System.out.println(people);
        //people.put(p4.getName(), p4);
        System.out.println(people);
        System.out.println(people.get("Nik").getName());
        Car car1 = new Passenger(1990, "BMW", CartState.EXCELLENT);
        Car car2 = new Passenger(1993, "BMW", CartState.EXCELLENT);
        Car car3 = new Passenger(1994, "BMW", CartState.EXCELLENT);
        Car car4 = new Passenger(1995, "BMW", CartState.EXCELLENT);

        Map<String, Car> autoRegistry = new HashMap<>();
        autoRegistry.put(car1.getYear() + car1.getManufacturer(), car1);
        autoRegistry.put(car2.getYear() + car2.getManufacturer(), car2);
        autoRegistry.put(car3.getYear() + car3.getManufacturer(), car3);
        autoRegistry.put(car4.getYear() + car4.getManufacturer(), car4);
        System.out.println("Total car number is: " + autoRegistry.size());

        Map<String, Car> autoRegistryNew = new HashMap<>();
        //autoRegistryNew = autoRegistry;
        autoRegistryNew.putAll(autoRegistry);
        System.out.println("New map: " + autoRegistryNew);
        Car lookupCar = autoRegistry.get("1994BMW+X");
        System.out.println("Lookup Car: "+ lookupCar);
    }
}
