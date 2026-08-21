package d01_creational_patterns.p03_abstract_factory.s01_before;

import d01_creational_patterns.p02_factory_method.s02_after.DefaultShipFactory;
import d01_creational_patterns.p02_factory_method.s02_after.Ship;
import d01_creational_patterns.p02_factory_method.s02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
