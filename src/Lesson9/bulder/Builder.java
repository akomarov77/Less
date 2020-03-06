package Lesson9.bulder;

public class Builder {
    private Body bodyForVessel;
    private Missile missileFroVessel;
    private Engine engineFroVessel;
    public Builder addBody(Body bodyFromSupply) {
        bodyForVessel = bodyFromSupply;
        return this;
    }
    public Builder addMissile(Missile missileFromSupply) {
        missileFroVessel = missileFromSupply;
        return this;
    }
    public Builder addEngine(Engine engineFromSupply) {
        engineFroVessel = engineFromSupply;
        return this;
    }
    public Vessel build() {
        return new Vessel(bodyForVessel, engineFroVessel, missileFroVessel);
    }
}
