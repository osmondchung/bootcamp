// During compile-time, the way to ensure a object comply with a contract (with method)

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class Book implements Comparable<Book>{ // method, input: String, output: int
  private String name;

  public Book(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  // compareTo() -> ordering logic of Book
  // 2 Objects here: this (Book object) and book (another Book object)
  @Override
  public int compareTo(Book book){ // the defination of ordering of Book
    //return this.name.compareTo(book.getName()); // ascending order
    return book.getName().compareTo(this.name); // descending order
    }

  public static int compareBook(Book b1, Book b2){
    return b1.compareTo(b2);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.name, book.name);
  }

  @Override
  public String toString(){
    return "Book name = " + this.name;
  }

  public static void main(String[] args) {
    System.out.println("abc".compareTo("ccd"));
    int result = compareBook(new Book("def"), new Book("hjk"));
    System.out.println(result);

    Queue<Book> bq = new PriorityQueue<>();
    bq.add(new Book("uii"));
    bq.add(new Book("sasd"));
    bq.add(new Book("asd"));
    bq.add(new Book("wer"));

    while(!bq.isEmpty()){
      System.out.println(bq.poll());
    }

    }

}
