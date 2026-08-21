package d01_creational_patterns.p03_abstract_factory.s02_after;

import d01_creational_patterns.p02_factory_method.s02_after.Ship;
import d01_creational_patterns.p02_factory_method.s02_after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
