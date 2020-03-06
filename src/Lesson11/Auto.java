package Lesson11;

public class Auto implements Comparable<Auto> {

    private int price;
    private String producer;
    private long weight;

    public Auto(int price, String producer, long weight) {
        this.price = price;
        this.producer = producer;
        this.weight = weight;
    }

    @Override
    public int compareTo(Auto auto) {
        return this.price - auto.getPrice();
    }

    public int getPrice() {
        return price;
    }

    public String getProducer() {
        return producer;
    }

    public long getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "price=" + price +
                ", producer='" + producer + '\'' +
                ", weight=" + weight +
                '}';
    }
}
