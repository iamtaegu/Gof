package factory_4장.idcard;

import factory_4장.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard (String owner, int serial) {
        System.out.println(owner + "의 " + serial + "번 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
