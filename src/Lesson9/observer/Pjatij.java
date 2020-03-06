package Lesson9.observer;

public class Pjatij implements Observer {
    @Override
    public void getEvent(String forecast) {
        System.out.println(" 5 govorit ... ");
        System.out.println(" Blah Blah" +
                " .. pogoda budet :" + forecast);
    }
}
