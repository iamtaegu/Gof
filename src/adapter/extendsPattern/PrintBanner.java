package adapter.extendsPattern;

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

/**
 * Adapter 역할
 * 준비된 Banner 클래스를 확장(extends)하여 showWithParen/Aster 상속 받고
 * 필요한 Print 인터페이스를 구현(implements)하여 printWeak/Strong 메소드를 구현
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
*/
