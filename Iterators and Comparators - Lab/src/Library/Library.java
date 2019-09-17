package Library;


import java.util.Iterator;
import java.util.function.Consumer;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... book) {
        this.books = book;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book> {

        private int index;

        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }

        @Override
        public Book next() {
            return books[this.index++];
        }
    }

    @Override
    public void forEach(Consumer<? super Book> action) {
        for (Book book : this) {
            action.accept(book);
        }
    }
}
