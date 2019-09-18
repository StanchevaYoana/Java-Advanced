package BookComparator;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book o1) {
        if (this.title.compareTo(o1.getTitle()) == 0) {
            return this.year - o1.getYear();
        } else {
            return this.title.compareTo(o1.getTitle());
        }
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}
