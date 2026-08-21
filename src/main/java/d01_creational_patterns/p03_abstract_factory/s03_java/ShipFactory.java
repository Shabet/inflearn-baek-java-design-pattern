package d01_creational_patterns.p03_abstract_factory.s03_java;

import d01_creational_patterns.p02_factory_method.s02_after.Ship;
import d01_creational_patterns.p02_factory_method.s02_after.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
