package iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    /**
     * Iterable 인터페이스에 선언된 메소드를 오버라이드
     * @return
     */
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
