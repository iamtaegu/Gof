package abstractFactory_8장.listfactory;

import abstractFactory_8장.factory.Item;
import abstractFactory_8장.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>\n")
                .append("<html><head><title>")
                .append(title)
                .append("</title></head>\n")
                .append("<body>\n")
                .append("<h1>")
                .append(title)
                .append("</h1>\n")
                .append("<ul>\n");
        for (Item item:content) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n")
                .append("<hr><address>")
                .append(author)
                .append("</address>\n")
                .append("</body></html>\n");
        return  sb.toString();
    }
}
