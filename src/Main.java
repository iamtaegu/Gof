import adapter.FileIO;
import adapter.FileProperties;
import adapter.extendsPattern.Print;
import adapter.extendsPattern.PrintBanner;
import iterator.Book;
import iterator.BookShelf;
import template_3장.AbstractDisplay;
import template_3장.CharDisplay;
import template_3장.StringDisplay;

import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //iteratorPattern();
        //adapterPattern();
        // 3장 templatePattern
        templatePattern();
    }

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
