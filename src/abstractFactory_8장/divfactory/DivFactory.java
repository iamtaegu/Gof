package abstractFactory_8장.divfactory;

import abstractFactory_8장.factory.Factory;
import abstractFactory_8장.factory.Link;
import abstractFactory_8장.factory.Page;
import abstractFactory_8장.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
