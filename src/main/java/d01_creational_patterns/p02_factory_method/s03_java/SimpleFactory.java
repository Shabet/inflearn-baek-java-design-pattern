package d01_creational_patterns.p02_factory_method.s03_java;

import d01_creational_patterns.p02_factory_method.s02_after.Blackship;
import d01_creational_patterns.p02_factory_method.s02_after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
