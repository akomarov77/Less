package lesson5;


import myClasses.Car;
import myClasses.Person;
import myClasses.SortingUtils;

public class Lesson5 {

    //Home Work:
    static void printStatistics(Person[] team) {
        Person oldest = team[0];
        Person youngest = team[0];
        for (int i = 0; i < team.length; i++) {
            if (team[i].age > oldest.age) {
                oldest = team[i];
            }
            if (team[i].age < youngest.age) {
                youngest = team[i];
            }
        }
        System.out.println("Oldest Employee " + oldest.name + " with age: " + oldest.age + "AND HIS SALARY IS: " + oldest.salary);
        System.out.println("Youngest Employee " + youngest.name + " with age: " + youngest.age + "AND HIS SALARY IS: " + +youngest.salary);
    }

    public static void main(String[] args) {
        Person p1 = new Person(18, 5_000L, "Nik-young", "FB", true);
        p1.becameOneYearOlder();
        p1.salary = 100;
        System.out.println(p1);
        Person p2 = new Person(30, 6_000L, "Gregor", "FB", true);
        Person p3 = new Person(65, 18_000L, "Joe-old", "FB", true);
        p1.sayHelloTo(p2);

        p1.sayHello();
        p2.sayHello();
        p3.sayHello();

        Person[] dreamTeam = {p1, p2, p3};
        //printStatistics(dreamTeam);
        System.out.println(Person.MIN_AGE);

        Person petr = new Person(60, 9_000L, "Petr", "FB", true);
        Person petrOther = new Person(60, 9_000L, "Petr", "FB", true);
        //petrOther = petr;
        boolean resultLink = petr == petrOther;
        boolean resultEquals = petr.equals(petrOther);
        System.out.println("Link comparison: " + resultLink);
        System.out.println("Equal comparison: " + resultEquals);
        System.out.println("Petr HashCode: " + petr.hashCode());
        System.out.println("PetrOther HashCode: " + petrOther.hashCode());
        System.out.println(petr.getClass().getName());
        System.out.println("Person Object States: " + petr);
        //System.out.println("Person Object States: " + petr.toString());

        //Final!!
        final int f = 3;
        //f = f + 7;
        //f += 4;
        //f *= 2;
        System.out.println("f=" + f);

        final Person p33 = new Person();
        final Person p44 = new Person();
        //p33 = p44;

        int[] arrayToSort = {9, 9, 63, 8, 7, 2, 55, 7, 66, 44};
        //usage of static method:
        SortingUtils.sortAndPrintArrayOfInt(arrayToSort);

        //TODO add elements to array
        Person[] arrayPersonToSort = {};
        SortingUtils.sortAndPrintArrayOfPerson(arrayPersonToSort);

        //TODO add elements to array
        Car[] arrayCarToSort = {};
        SortingUtils.sortAndPrintArrayOfCar(arrayCarToSort);


    }
}
