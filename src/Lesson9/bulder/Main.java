package Lesson9.bulder;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        Engine engine = new Engine();
        Missile missile = new Missile();

        Builder builder = new Builder();
        builder.addEngine(engine)
                .addBody(body);

        System.out.println("Take some time..");

        builder.addMissile(missile);
        Vessel newVessel = builder.build();
    }
}
