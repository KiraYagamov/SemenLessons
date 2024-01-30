package Library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Reader> readers = new ArrayList<>();

    public static void main(String[] args) {
        Library library = new Library();
        library.start();
    }

    public void start(){
        addBooks();
        addReaders();

        getRandomReader().takeBook(getRandomBook());
        getRandomReader().takeBook(getRandomBook());
        getRandomReader().takeBook(getRandomBook());

        Reader r = getRandomReader();

        r.returnBook(r.getRandomBook());
    }

    public void addBooks(){
        books.add(new Book("Булгаков", "Мастер и Маргарита"));
        books.add(new Book("Жюль Верн", "Таинственный остров"));
        books.add(new Book("Рэй Брэдбери", "451 градус по фаренгейту"));
    }
    public void addReaders(){
        readers.add(new Reader("Иван", this));
        readers.add(new Reader("Пётр", this));
        readers.add(new Reader("Андрей", this));
    }
    public Book getRandomBook(){
        int index = (int) (Math.random() * books.size());
        return books.get(index);
    }
    public Reader getRandomReader(){
        int index = (int) (Math.random() * readers.size());
        return readers.get(index);
    }
}