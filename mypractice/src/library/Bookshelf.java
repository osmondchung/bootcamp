package library;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
  private List<Book> books;

  public Bookshelf(){
    this.books = new ArrayList<>();
  }

  public void add(Book book){
    this.books.add(book);
  }

  public void returnBook(Book book){
    this.books.add(book);
  }

  public void borrowBook(Book book){
    this.books.remove(book);
  }

  public List<Book> getBooks(){
    return this.books;
  }

}
