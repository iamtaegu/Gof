package abstractFactory_8장.factory;

/**
 * Link와 Tray를 동일시하기 위한 부모 클래스
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
