package abstractFactory_8장.naverfactory;

import abstractFactory_8장.factory.Factory;
import abstractFactory_8장.factory.Link;
import abstractFactory_8장.factory.Page;
import abstractFactory_8장.factory.Tray;

public class NaverFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new NaverLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new NaverTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new NaverPage(title, author);
    }
}
