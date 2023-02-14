package abstractFactory_8장.naverfactory;

import abstractFactory_8장.factory.Item;
import abstractFactory_8장.factory.Page;

public class NaverPage extends Page {
    public NaverPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n")
                .append("<html><head><title>")
                .append(title)
                .append("</title><style>\n")
                .append("div.TRAY { padding:0.5em; margin-left:5em; border:1px solid black; } \n")
                .append("div.LINK { padding:0.5em; background-color: lightgray; }\n")
                .append("</style></head><body>\n")
                .append("<h1>")
                .append(title)
                .append("</h1>\n");
        for (Item item: content) {
            sb.append(item.makeHTML());
        }
        sb.append("<hr><address>")
                .append(author)
                .append("</address>\n")
                .append("</body></html>\n");
        return sb.toString();
    }
}
