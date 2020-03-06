package Lesson9.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();

        String str = "RTR TRY UYTII";
        String str1 = new String("RRR");
        String str2 = new String("RRR");
        System.out.println(str == str1);

        String[] split = str.split(" ");
    }
}
