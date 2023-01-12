import iterator.Book;
import iterator.BookShelf;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
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
