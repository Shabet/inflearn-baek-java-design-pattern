package d01_creational_patterns.p03_abstract_factory.s02_after;

import d01_creational_patterns.p03_abstract_factory.s01_before.WhiteAnchor;
import d01_creational_patterns.p03_abstract_factory.s01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
