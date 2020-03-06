package Lesson11.generic;

public class Employee extends Person {
    private int password = 999999999;
    public Employee(int age, String name) {
        super(age, name);
    }

    public Employee(int age, String name, String secondName) {
        super(age, name, secondName);
    }

    private int exposeSecret(){
        System.out.println("We hack the object: ..");
        return password;
    }
}
