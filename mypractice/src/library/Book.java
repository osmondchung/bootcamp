package library;

import java.util.Objects;

public class Book {
  private String name;
  private String author;
  private int pubyear;

  public Book(String name, String author, int pubyear){
    this.name = name;
    this.author = author;
    this.pubyear = pubyear;
  }

  public String getname(){
    return this.name;
  }

  public String getName(){
    return this.author;
  }

  public int getPubyear(){
    return this.pubyear;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.author, this.pubyear);
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.name, book.name)
      && Objects.equals(this.author, book.author)
      && this.pubyear == book.pubyear;
  }

  @Override
  public String toString(){
    return "Book name = " + this.name + "Book author= " + this.author + "Book pubyear= " + this.pubyear;
  }
  

}
