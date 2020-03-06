package Lesson11.generic;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;

public abstract class Person {

    private int age;

    @NotNull
    private String name;

    @Deprecated
    private String secondName;
    private LocalDate birthday;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age, String name, String secondName) {
        this(age, name);
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
