package myClasses;

import java.util.Objects;

public class Person {
    public static final int MIN_AGE = 18;

    public Person() {
        System.out.println("Constructor1...");
        this.companyName = "FB";
    }

    public Person(String name) {
        System.out.println("Constructor2...");
        this.companyName = "Oracle";
        this.name = name;
    }

    public Person(long salary) {
        System.out.println("Constructor3...");
        this.salary = salary;
        int randomAge = (int) (Math.random() * 47 + 18);
        this.age = randomAge;
    }

    public Person(int age, long salary, String name, String companyName, boolean gender) {
        if (age < MIN_AGE) {
            System.out.println("Impossible");
            //throw new IllegalArgumentException();
        }

        this.age = age;
        this.salary = salary;
        this.name = name;
        this.companyName = companyName;
        this.gender = gender;
    }

    public int age;
    public long salary;
    public String name;
    public String companyName;
    public boolean gender;

    public void sayHello() {
        System.out.println("Hello from " + this.name + "!!!");
    }

    public void sayHelloTo(Person toPerson) {
        System.out.println(this.name + "says Hello to " + toPerson.name + " :)");
    }

    public void becameOneYearOlder() {
        this.age++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                salary == person.salary &&
                gender == person.gender &&
                Objects.equals(name, person.name) &&
                Objects.equals(companyName, person.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary, name, companyName, gender);
    }

    @Override
    public String toString() {
        return "myClasses.PersonYYYYYYYY{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
