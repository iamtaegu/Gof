package abstractFactory_8장.listfactory;

import abstractFactory_8장.divfactory.DivPage;
import abstractFactory_8장.divfactory.DivTray;
import abstractFactory_8장.factory.Factory;
import abstractFactory_8장.factory.Link;
import abstractFactory_8장.factory.Page;
import abstractFactory_8장.factory.Tray;

/**
 * Factory를 상속받아
 * 동적으로 생성
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
