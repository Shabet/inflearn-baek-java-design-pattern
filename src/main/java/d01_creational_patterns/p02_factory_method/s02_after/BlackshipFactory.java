package d01_creational_patterns.p02_factory_method.s02_after;

public class BlackshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
