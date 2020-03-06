package lesson13;

import Lesson11.generic.Citizen;

import java.util.Optional;

public class Lesson13 {
    public static void main(String[] args) {
        Citizen citizenNull = null;
        Citizen citizen = new Citizen(25, "Joe");
        Citizen citizenDefault = new Citizen(99, "Def");
        Optional<Citizen> optEmpty = Optional.empty();
        //Optional<Citizen> optEmpty1 = Optional.ofNullable(null);
        Optional<Citizen> optNullable = Optional.ofNullable(citizenNull);
        Optional<Citizen> optJoe = Optional.of(citizen);
        //.get() ...
        System.out.println(".get() from Optional: " + optJoe.get());
        //System.out.println(".get() from Optional: " + optNullable.get());
        if (optEmpty.isPresent()) {
            System.out.println(".get() from Optional: " + optEmpty.get());
        }
        //System.out.println(".get() from Optional: " + optEmpty.get());
        if (optNullable.isPresent()) {
            System.out.println(".get() from Optional: " + optNullable.get());
        }
        //
        System.out.println(".orElse(T t) from Optional: " + optJoe.orElse(citizenDefault));
        System.out.println(".orElse(T t) from Optional: " + optNullable.orElse(citizenDefault));

        System.out.println(".orElseGet(Supplier<T> t) from Optional: "
                + optJoe.orElse(citizenDefault));
        System.out.println(".orElseGet(Supplier<T> t) from Optional: "
                + optNullable.orElseGet(() -> new Citizen(44, "DefFromSuppl")
        ));

        optJoe.ifPresent((c) -> {
            System.out.println("Hello from Consumer!!!!");
            System.out.println("I've consumed :" + c.getName());
            System.out.println("I am very happy...");
        });

        optNullable.ifPresent((c) -> {
            System.out.println("Hello from Consumer!!!!");
            System.out.println("I've consumed :" + c.getName());
            System.out.println("I am very happy...");
        });
    }
}
