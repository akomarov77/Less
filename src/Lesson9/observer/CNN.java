package Lesson9.observer;

public class CNN implements Observer {
    @Override
    public void getEvent(String forecast) {
        System.out.println(" CNN says ... ");
        System.out.println(" Blah Blah" +
                " .. weather is " + forecast);
    }
}
