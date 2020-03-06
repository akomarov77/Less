package Lesson9.observer;

public class EuroNews implements Observer {

    @Override
    public void getEvent(String forecast) {
        System.out.println(" Euronews says ... ");
        System.out.println(" Weather is " + forecast);
    }
}
