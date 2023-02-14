import abstractFactory_8장.factory.Factory;
import abstractFactory_8장.factory.Link;
import abstractFactory_8장.factory.Page;
import abstractFactory_8장.factory.Tray;
import adapter.FileIO;
import adapter.FileProperties;
import adapter.extendsPattern.Print;
import adapter.extendsPattern.PrintBanner;
import builder_7장.Director;
import builder_7장.HTMLBuilder;
import builder_7장.TextBuilder;
//import factory_4장.framework.Product;
import factory_4장.idcard.IDCardFactory;
import iterator.Book;
import iterator.BookShelf;
import protoType_6장.MessageBox;
import protoType_6장.UnderlinePen;
import protoType_6장.framework.Manager;
import protoType_6장.framework.Product;
import singleton_5장.Singleton;
import singleton_5장.TicketMaker;
import singleton_5장.Triple;
import template_3장.AbstractDisplay;
import template_3장.CharDisplay;
import template_3장.StringDisplay;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //iteratorPattern();
        //adapterPattern();

        //templatePattern(); // 3장 templatePattern
        //factoryPattern(); // 4장 factoryPattern
        //singletonPattern(); // 5장 singletonPattern
        //prototypePattern(); // 6장 prototypePattern
        //builderPattern(); // 7장 builderPattern
        abstractFactoryPattern();
    }

    /**
     * import는 factory 패키지 뿐이고, 구체적인 부품,제품,공장을 전혀 이용하지 않음
     * divFactory 추가에 따른 수정 사항은 * classname 밖에 없음
     */
    private static void abstractFactoryPattern() {
<<<<<<< HEAD
        String filename = "div.html";
        //String classname = "abstractFactory_8장.listfactory.ListFactory";
        String classname = "abstractFactory_8장.divfactory.DivFactory";
=======
        String filename = "list.html";
        String classname = "abstractFactory_8장.listfactory.ListFactory";
>>>>>>> 90726424f769d047f36549b3ca1ac3eebf3697e8

        Factory factory = Factory.getFactory(classname);

        // Blog
        Link blog1 = factory.createLink("Blog 1" , "https://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2" , "https://example.com/blog2");
        Link blog3 = factory.createLink("Blog 3" , "https://example.com/blog3");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        // News
        Link news1 = factory.createLink("News 1", "https://example.com/news1");
        Link news2 = factory.createLink("News 2", "https://example.com/news2");
        Tray news3 = factory.createTray("News 3");
        news3.add(factory.createLink("News 3 (US)", "https://example.com/news3us"));
        news3.add(factory.createLink("News 3 (KOREA)", "https://example.com/news3kr"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        // Page
        Page page = factory.createPage("Blog and News", "taegeon.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);
    }

    private static void builderPattern() {

        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getTextResult();
        System.out.println(result);

        System.out.println("\n\n");

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        director = new Director(htmlBuilder);
        director.construct();
        String filename = htmlBuilder.getHTMLResult();
        System.out.println(filename);

    }

    private static void prototypePattern() {
        /**
         * Manager 인스턴스를 만들고
         * UnderlinePen, MessageBox 인스턴스 등록
         */
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        //등록
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        //생성과 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.");
    }

    private static void singletonPattern() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("같은 인스턴스입니다.");
        } else {
            System.out.println("다른 인스턴스입니다.");
        }

        // 연습문제
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        if (ticketMaker1 == ticketMaker2) {
            System.out.println("같은 인스턴스입니다.");
        } else {
            System.out.println("다른 인스턴스입니다.");
        }

        System.out.println(ticketMaker1.getNextTicketNumber());
        System.out.println(ticketMaker2.getNextTicketNumber());
        System.out.println(ticketMaker1.getNextTicketNumber());
        System.out.println(ticketMaker2.getNextTicketNumber());

        System.out.println("===Triple===");

        Triple t1 = Triple.getInstance("ALPHA");
        Triple t2 = Triple.getInstance("BETA");
        Triple t3 = Triple.getInstance("GAMMA");

        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t3.name);


    }

    /* private static void factoryPattern() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("card1");
        Product card2 = factory.create("card2");
        Product card3 = factory.create("card3");
        card1.use();
        card2.use();
        card3.use();

    } */

    private static void templatePattern() {
        // 'H'를 가진 CharDisplay 인스턴스를 하나 만듬
        AbstractDisplay d1 = new CharDisplay('H');
        // "Hello, world."를 가진 StringDisplay 인스턴스를 하나 만듬
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있음
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해짐
        d1.display();
        d2.display();
    }

    private static void adapterPattern() {

        //extendsPattern();
        delegationPattern();
        practiceProblem();
    }

    private static void practiceProblem() {
        System.out.println("[practiceProblem START]");

        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("[practiceProblem END]");
    }

    /**
     * showWithParen/Aster 처리를
     * PrintBanner에 Banner 인스턴에 위임
     */
    private static void delegationPattern() {
        // 사실 Main 코드의 변경은 없고,
        // 내부적으로 Paren/Aster 처리에 대한 pattern만 변경 됐음
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    /**
     * 어댑터 역할을 하는 PrintBanner 클래스를 이용해 Hello 문자열을 약하게(괄호 묶음) 혹은 강하게(* 묶음) 표시
     */
    private static void extendsPattern() {

        // PrintBanner 인스턴스를 Print 인터페이스형 변수에 대입
        // 이 메소드를 Print 인터페이스를 사용해서 프로그래밍 하고 있음
        // Banner 클래스나 showWithParen/Aster 메소드는 숨겨져 있음

        // 여기서 PrintBanner 클래스가 어떻게 구현되어 있는지는 모르기 때문에
        // PrintBanner의 구현은 기능에 따라 변경될 수 있음
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    private static void iteratorPattern() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // 명시적으로 Iterator를 사용하는 방법
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문 사용
        // > Java의 확장 for문은 Iterable 인터페이스를 구현한 클래스의
        // > 인스턴스에 대해 내부적으로 Iterator를 사용하여 처리
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }

}
