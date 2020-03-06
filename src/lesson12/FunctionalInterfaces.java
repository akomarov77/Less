package lesson12;

import Lesson11.generic.Citizen;
import Lesson11.generic.Employee;
import Lesson9.homeWork.Car;
import Lesson9.homeWork.CartState;
import Lesson9.homeWork.Passenger;
import Lesson9.homeWork.Truck;
import myClasses.Person;

import java.util.function.*;

public class FunctionalInterfaces {

    static void useSupplier(Supplier<String> stringSupplier) {
        System.out.println(stringSupplier.get());
    }

    static String useFunction(Function<Integer, String> function,
                              Integer integer) {
        return function.apply(integer);
    }

    static void usePredicate(Predicate<Car> carPredicate, Car testCat) {
        boolean isOk = carPredicate.test(testCat);
        System.out.println(isOk ? "Car is Ok" : "Not a good One");
    }

    static void getAverageAge(BiFunction<Citizen, Employee, Double> biF,
                              Citizen citizen,
                              Employee employee) {
        System.out.println("Average age is: " + biF.apply(citizen, employee));
    }

    static void marriage(BiConsumer<Citizen, Citizen> zags, Citizen groom, Citizen bride) {
        System.out.println("Bride before marriage: " + bride);
        zags.accept(groom, bride);
        System.out.println("Bride after marriage: " + bride);
    }

    static void useUnaryOperator(UnaryOperator<Person> unaryOperator, Person person) {
        System.out.println("Person Before UO: " + person);
        unaryOperator.apply(person);
        System.out.println("Person After UO: " + person);
    }

    static void activeUseOfCar(UnaryOperator<Car> uo, Car myCar) {
        System.out.println("Car before usage: " + myCar);
        uo.apply(myCar);
        System.out.println("Car after usage: " + myCar);
    }

    public static void main(String[] args) {
        //UnaryOperator:
        Car car = new Passenger(2019, "BMW", CartState.EXCELLENT);
        activeUseOfCar((c) -> {
            c.setCartState(CartState.BAD);
            return c;
        }, car);

        Citizen citizen = new Citizen(34, "Nik");

        Employee employee = new Employee(56, "Jo");
        getAverageAge((c, e) -> new Double((c.getAge() + e.getAge()) / 2)
                , citizen, employee);


        Citizen chak = new Citizen(34, "Chak", "Norris");
        Citizen alla = new Citizen(25, "Alla", "Pug");
        marriage((g, b) -> b.setSecondName(g.getSecondName()), chak, alla);

        Person person = new Person(45, 56000l, "Nik", "FB", true);

        MyUnaryOperator classUnaryOperator = new MyUnaryOperator();
        useUnaryOperator(classUnaryOperator, person);
        int delta = 67;
        useUnaryOperator((p) -> {
            p.salary += delta;
            return p;
        }, person);
        String newCompany = "Google";


        //Supplier:
        Supplier<String> classSupplier = new MySupplier();
        Supplier<String> anonymousSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "from Anonymous initialization";
            }
        };
        Supplier<String> lambdaSuppler = () -> "from Lambda supplier";

        useSupplier(classSupplier);
        useSupplier(anonymousSupplier);
        useSupplier(lambdaSuppler);

        int age = 1300;
        useSupplier(() -> "A" + age);

        //Function:
        Function<Integer, String> classFunction = new MyFunction();
        Function<Integer, String> anonymousFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "String from anonymous initialization: " + integer.toString();

            }
        };
        Function<Integer, String> lambdaFunction = (i) -> "From Lambda: " + i.toString();
        System.out.println(useFunction(classFunction, 444));
        System.out.println(useFunction(anonymousFunction, 890));
        System.out.println(useFunction(lambdaFunction, 666));
        System.out.println(useFunction((i) -> i + "from Inline Lambda", 22));

        //Predicate:
        Predicate<Car> classPredicate = new MyPredicate();
        Car car1 = new Truck(2050, "BMW", CartState.EXCELLENT);
        Car car2 = new Truck(2050, "Tesla", CartState.EXCELLENT);
        usePredicate(classPredicate, car1);
        usePredicate(classPredicate, car2);
    }
}
