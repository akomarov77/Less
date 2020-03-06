package lesson18;

import java.util.stream.Stream;

public class Mark {
    @MyLog
    public void doSmth() {
        System.out.println(".doSmth()");
        Stream.iterate(3, i -> i + 3).limit(5).forEach(i -> System.out.println("i = " + i));
    }

    @MyLog
    public int getRandom(){
        System.out.println(".getRandom()");
        return 2;
    }

    public int getRandom1(){
        System.out.println(".getRandom1()");
        return 4;
    }
}
