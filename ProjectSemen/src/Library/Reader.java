package Library;

import java.util.ArrayList;

public class Reader {
    public String name;
    public ArrayList<Book> takenBooks;
    public Library currentLibrary;

    public Reader(String name, Library library){
        this.name = name;
        currentLibrary = library;
        takenBooks = new ArrayList<>();
    }

    public void takeBook(Book book){
        if(book != null) {
            takenBooks.add(book);
            currentLibrary.books.remove(book);
            System.out.println(name + " взял книгу \"" + book.title + "\"");
        }
        else System.out.println("Такой книги не сужествует!");
    }

    public void returnBook(Book book){
        if(book != null) {
            currentLibrary.books.add(book);
            takenBooks.remove(book);
            System.out.println(name + " вернул книгу \"" + book.title + "\"");
        }
        else System.out.println("Такой книги не сужествует!");
    }

    public Book getRandomBook(){
        int index = (int) (Math.random() * takenBooks.size());
        if(takenBooks.size() >= index - 1) {
            return takenBooks.get(index);
        }
        return null;
    }
}