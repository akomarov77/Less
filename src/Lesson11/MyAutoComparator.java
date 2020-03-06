package Lesson11;

import java.util.Comparator;

public class MyAutoComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        //int priceDelta = o1.getPrice() - o2.getPrice();
        int producerDelta = o1.getProducer().compareTo(o2.getProducer());

        return producerDelta;
    }

}
