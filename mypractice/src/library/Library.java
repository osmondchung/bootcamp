package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Bookshelf> bookshelves;

  public Library() {
    this.bookshelves = new ArrayList<>();
  }

  public void add(Bookshelf bookshelf){
    this.bookshelves.add(bookshelf);
  }
  
  public void showBooks(){
    for (Bookshelf bs : bookshelves){
      System.out.println(bs.getBooks());
    }
  }


  public static void main(String[] args) {
    Bookshelf bs1 = new Bookshelf();
    Bookshelf bs2 = new Bookshelf();
    Library lib1 = new Library();
    Book b1 = new Book("Power", "Louis", 2000);
    Book b2 = new Book("Leader", "oscar", 1980);
    Book b3 = new Book("nien", "hler", 1911);
    Book b4 = new Book("yowee", "nig", 2013);
    bs1.add(b1);
    bs1.add(b4);
    bs2.add(b2);
    bs2.add(b3);

    lib1.add(bs1);
    lib1.add(bs2);
    bs1.returnBook(b4);
    lib1.showBooks();
    
  }
}