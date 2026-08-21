package d02_structural_patterns.p08_composite.s02_after;

public class Character implements Component {

    private Bag bag;

    @Override
    public int getPrice() {
        return bag.getPrice();
    }

}
