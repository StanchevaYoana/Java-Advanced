package Library;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java4Ever", 2019, "Yoana Stancheva");
        Book book2 = new Book("JSCourse", 2019, "Daria Stancheva");

        Library library = new Library(book1, book2);

        library.forEach(e -> System.out.println(e));
    }
}
