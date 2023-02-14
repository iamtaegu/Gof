package abstractFactory_8장.listfactory;

import abstractFactory_8장.factory.Link;

/**
 * Link 설계(API)에 맞춰 작성
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        //부모 생성자를 호출하지 않으면 기본 생성자가 호출 되는데
        //부모 클래스에 기본 생성자가 없기 때문에
        //부모 생성자 호출 명시
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
