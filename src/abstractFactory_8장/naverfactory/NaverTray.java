package abstractFactory_8장.naverfactory;

import abstractFactory_8장.factory.Item;
import abstractFactory_8장.factory.Tray;

public class NaverTray extends Tray {
    public NaverTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>")
                .append(caption)
                .append("</b></p>\n")
                .append("<div class=\"TRAY\">");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}
