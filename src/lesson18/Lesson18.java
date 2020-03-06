package lesson18;

import Lesson11.generic.Employee;
import Lesson9.homeWork.CartState;
import Lesson9.homeWork.Passenger;
import Lesson9.homeWork.Truck;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Lesson18 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(".getName(): " + obj.getClass().getName());

        Object car = new Passenger(2019, "Bugatti", CartState.EXCELLENT);
        Class<?> carClass = car.getClass();

        System.out.println(".getName(): " + carClass.getName());

        Constructor<?>[] passengerCarConstructors = carClass.getConstructors();
        System.out.println(".getConstructors(): " + passengerCarConstructors.length);
        System.out.println("Constructors info: " + passengerCarConstructors);

        Method[] carClassMethods = carClass.getMethods();
        System.out.println(".getMethods(): " + carClassMethods.length);
        System.out.println("All methods names: ");
        Arrays.asList(carClassMethods).forEach(m -> System.out.println(m.getName()));

        System.out.println("=====================================================================");

        Method[] carClassDeclaredMethods = carClass.getDeclaredMethods();
        System.out.println(".getDeclaredMethods(): " + carClassDeclaredMethods.length);
        System.out.println("All declared methods names: ");
        Arrays.asList(carClassDeclaredMethods).forEach(m -> System.out.println(m.getName()));

        System.out.println("=====================================================================");

        Field[] carClassFields = carClass.getFields();
        System.out.println(".getFields(): " + carClassFields.length);
        System.out.println("All fields names: ");
        Arrays.asList(carClassFields).forEach(f -> System.out.println(f.getName()));

        System.out.println(".....");

        Field[] carClassDeclaredFields = carClass.getDeclaredFields();
        System.out.println(".getDeclaredFields(): " + carClassDeclaredFields.length);
        System.out.println("All declared fields names: ");
        Arrays.asList(carClassDeclaredFields).forEach(f -> System.out.println(f.getModifiers()));

        Constructor<?>[] truckClassConstructors = Truck.class.getConstructors();
        System.out.println(".getConstructors(): " + truckClassConstructors.length);
        System.out.println(".getDeclaredConstructors(): " + Truck.class.getDeclaredConstructors().length);
//tests
        Object secretObject = new Employee(99, "Joe");

        Class<?> secretObjectClass = secretObject.getClass();
        Method[] secretObjectMethods = secretObjectClass.getDeclaredMethods();
        Method secretMethod = Arrays.asList(secretObjectMethods).stream()
                .filter(m -> m.getName().toLowerCase().contains("secret")).findAny()
                .orElseThrow(() -> new RuntimeException("No Secret Methods"));
        try {
            secretMethod.setAccessible(true);
            Object invokeResult = secretMethod.invoke(secretObject);
            System.out.println(invokeResult.getClass().getName());
            System.out.println(invokeResult);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //Processor example:
        Mark markObject = new Mark();
        MyLogProcessor.process(markObject);
    }
}
