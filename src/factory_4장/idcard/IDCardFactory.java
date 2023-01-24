package factory_4장.idcard;

import factory_4장.framework.Factory;
import factory_4장.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected void registerProduct(Product p) {
        System.out.println(p + "을 등록했습니다.");
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
}
