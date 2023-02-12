package abstractFactory_8장.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상적인 부품 클래스
 */
public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
