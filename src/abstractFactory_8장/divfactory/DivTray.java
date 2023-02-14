package abstractFactory_8장.divfactory;

import abstractFactory_8장.factory.Item;
import abstractFactory_8장.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
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
