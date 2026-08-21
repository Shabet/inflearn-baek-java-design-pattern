package d01_creational_patterns.p03_abstract_factory.s02_after;

import d01_creational_patterns.p02_factory_method.s02_after.DefaultShipFactory;
import d01_creational_patterns.p02_factory_method.s02_after.Ship;
import d01_creational_patterns.p02_factory_method.s02_after.Whiteship;
import d01_creational_patterns.p03_abstract_factory.s01_before.WhiteAnchor;
import d01_creational_patterns.p03_abstract_factory.s01_before.WhiteWheel;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
