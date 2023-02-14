package abstractFactory_8장.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 추상적인 부품 클래스
 */
public abstract class Tray extends Item {
    /**
     * protected로 되어 있어 자식 클래스에서 직접 접근이 가능함(자식 클래스에서 변경할 수 있는 단점)
     * private로 변경하면 자식 클래스에서 직접 접근이 불가(getter를 제공해야 하고 변경할 수 없는 장점)
     */
    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
