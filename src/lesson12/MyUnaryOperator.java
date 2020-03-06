package lesson12;

import myClasses.Person;

import java.util.function.UnaryOperator;

public class MyUnaryOperator implements UnaryOperator<Person> {
    @Override
    public Person apply(Person p) {
        p.salary += 100;
        return p;
    }
}
