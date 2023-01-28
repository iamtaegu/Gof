package factory_4장.framework;

/***
 * 인스턴스를 생성하는 프레임워크
 */
public abstract class Factory {
    /**
     * 템플릿 메소드
     * 인스턴스 생성 방식을 상위 클래스에서 결정
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product p);
    protected abstract Product createProduct(String owner);
}
