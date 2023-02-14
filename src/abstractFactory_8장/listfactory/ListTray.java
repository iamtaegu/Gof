package abstractFactory_8장.listfactory;

import abstractFactory_8장.factory.Item;
import abstractFactory_8장.factory.Tray;

/**
 * Tray 설계(API)에 맞춰 작성
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption);
        sb.append("\n<ul>\n");
        for (Item item: tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
