package abstractFactory_8장.factory;

import abstractFactory_8장.divfactory.DivPage;
import abstractFactory_8장.divfactory.DivTray;

/**
 * 추상적인 공장 클래스
 * 추상적인 부품(Link, Tray)과 제품(Page) 코드를 작성했음
 *
 */
public abstract class Factory {
    /**ㄴ
     * 리플랙션(reflection): 컴파일러가 아닌 프로그램에서 클래스를 생성함
     * Class.forName을 사용하여 동적으로 해당 클래스를 가져오고,
     * getDeclaredConstructor 메소드로 생성자를 얻고,
     * newInstance로 인스턴스를 만듬
     * @param classname
     * @return
     */
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String cpation, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
