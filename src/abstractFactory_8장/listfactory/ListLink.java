package abstractFactory_8장.listfactory;

import abstractFactory_8장.factory.Link;

/**
 * Link 설계(API)에 맞춰 작성
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
