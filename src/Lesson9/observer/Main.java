package Lesson9.observer;

public class Main {
    public static void main(String[] args) {
        Observer cnn = new CNN();
        Observer en = new EuroNews();
        Observer pj = new Pjatij();

        MeteoStation meteo = new MeteoStation();

        /*meteo.addObserver(cnn);
        meteo.addObserver(en);
        meteo.addObserver(pj);*/

        meteo.addObservers(cnn, en, pj);

        meteo.eventFired("Hurricane!!!");
        meteo.eventFired("Flood!!!");
        meteo.removeObserver(pj);
        meteo.eventFired("Hot!!!");
    }
}
