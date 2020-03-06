package Lesson11.generic;

public class Citizen extends Person {
    public Citizen(int age, String name) {
        super(age, name);
    }

    public Citizen(int age, String name, String secondName) {
        super(age, name, secondName);
    }
}
