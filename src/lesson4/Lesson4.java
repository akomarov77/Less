package lesson4;

import myClasses.Person;

public class Lesson4 {

    static void printBlah() {
        System.out.println("Blah!!!");
    }

    static void printAverageAge(Person[] xMen) {
        int totalAge = 0;
        int totalSalary = 0;
        for (int i = 0; i < xMen.length; i++) {
            totalAge += xMen[i].age;
            totalSalary += xMen[i].salary;
        }
        double averageAge = totalAge / xMen.length;
        double averageSalary = totalSalary / xMen.length;
        System.out.print("Average age: " + averageAge + "\n");
        System.out.print("Average salary: " + averageSalary + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        Person jack = new Person();
        jack.name = "Jack";
        jack.age = 23;
        jack.companyName = "FB";
        jack.gender = true;
        jack.salary = 150_000;

        Person joe = new Person();
        joe.name = "Joe";
        joe.salary = 300_000;
        joe.companyName = "Google";
        joe.age = 48;
        joe.gender = true;

        Person julia = new Person();
        julia.name = "Julia";
        julia.age = 25;
        julia.gender = false;
        julia.companyName = "Oracle";
        julia.salary = 350_000;

        System.out.println("Initial state: ");
        System.out.println("jack -> " + jack);
        System.out.println("joe -> " + joe);
        System.out.println("julia -> " + julia);

        //References pint to other objects in memory:
        joe = jack;
        julia = joe;

        System.out.println("After pointing state: ");
        System.out.println("jack -> " + jack);
        System.out.println("joe -> " + joe);
        System.out.println("julia -> " + julia);

        Person[] people = {joe, julia, jack};

        //Print content of array myClasses.Person:
        System.out.println(people);//print just memory HASH

        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            System.out.println(p.name);
            //System.out.println(people[i]);
        }
        printAverageAge(people);

        printBlah();
        Person nik = new Person();
        //NULL discards refernce from the object!
        nik = null;

        //invoke Garbage Collector.
        // No guarantee that GC will be triggered!!!
        System.gc();

        //Usage of custom constructors:
        Person ivan = new Person("Ivan");

        System.out.println(nik.companyName);
        System.out.println(ivan.companyName);

        Person[] oracleTeam = new Person[10];
        long baseSalary = 2000;
        for (int i = 0; i < oracleTeam.length; i++) {
            long personalSalary = baseSalary + i;
            oracleTeam[i] = new Person(personalSalary);
        }
        printAverageAge(oracleTeam);
    }
}