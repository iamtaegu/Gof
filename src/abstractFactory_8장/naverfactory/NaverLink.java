package abstractFactory_8장.naverfactory;

import abstractFactory_8장.factory.Link;

public class NaverLink extends Link {
    public NaverLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<div class=\"LINK\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
    }
}
