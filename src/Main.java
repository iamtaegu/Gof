import adapter.extendsPattern.Print;
import adapter.extendsPattern.PrintBanner;
import iterator.Book;
import iterator.BookShelf;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //iteratorPattern();
        adapterPattern();
    }

    private static void adapterPattern() {

        extendsPattern();

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
