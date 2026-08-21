package d02_structural_patterns.p07_bridge.s01_before;

import d02_structural_patterns.p07_bridge.s02_after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
