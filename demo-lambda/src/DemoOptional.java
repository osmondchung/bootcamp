import java.time.LocalDate;
import java.util.Optional;
import javax.management.RuntimeErrorException;

public class DemoOptional {
  public static final String[] names = new String[] {"john", "lucas", "jason"};
  public static final Book[] books = new Book[] {new Book(LocalDate.of(2020, 10,20), "ABC")
                                    ,new Book(LocalDate.of(2021, 1,1), "DEF")
                                    ,new Book(LocalDate.of(1999, 12,31), "IJK")};

  public static class Book{
    private LocalDate publishDate;
    private String name;

    public Book(LocalDate publishDate, String name){
      this.name = name;
      this.publishDate = publishDate;
    }
    public String getBookName(){
      return this.name;
    }
    public LocalDate getPublishDate(){
      return this.publishDate;
    }

    @Override
    public String toString(){
      return this.name + " " + this.publishDate;
    }
  }

  public static void main(String[] args) {

    // Return Type -> Optional -> Searching
    System.out.println(concat("hello", "world"));
    System.out.println(findName("lucas"));
    System.out.println(findByBookName("DE"));
    System.out.println(findByBookName2("DE"));
    Optional<Book> targetBook = findByBookName2("DE");
    if (targetBook.isPresent()){
      System.out.println("Book=" + targetBook.get());
    } else{
      System.out.println("Book is not found.");
    }
    Optional<Book> targetBook2 = findbyPublishDate();
    if (targetBook2.isPresent()){
      System.out.println("Book= " + targetBook2.get());
    } else {
      System.out.println("Book is not found");
    }

    // Declare Optional (of, empty, ofNullable)
    Book b1 = null;
    //Optional.of(b1);
    Optional.ofNullable(b1); // OK, OfNullable() allows null or non-null value
    Optional<Book> b2 = Optional.empty();

    // isPresent() -> boolean, if true -> get(), false -> another flow
    // ifPresent() -> handle "true" flow only. USe the element directly, without get()
    targetBook.ifPresent(e -> {
      System.out.println(e.getPublishDate());
      System.out.println(e.getBookName());
    });

    // get the value from Optional Objecta:
    // 1. get() (after isPresent())
    // 2. orElse()
    Book targetBook3 = findByBookName2("MNO").orElse(null);
    Book targetBook4 = findByBookName2("MNO")
          .orElseThrow(() -> new RuntimeException("Book not found"));

  }

  public static String concat(String s1, String s2){
    if (s1 == null || s2 == null)
      throw new IllegalArgumentException("s1 & s2 should not be null.");
    return s1.concat(s2);
  }

  // searching
  public static boolean findName(String target){
    if (target == null)
      return false;
    for (String name : names){
      if (target.equals(name))
        return true;
    }
    return false;
  }

  // 
  public static Book findByBookName(String name){
    if (name == null)
      throw new IllegalArgumentException("Wrong Book Nmae.");
    for (Book book : books){
      if (book.getBookName().contains(name)){
        return book;
      }
    }
    return null; // Not found, but we dont treat it as a system error
  }

  // Java 8: Optional (not Found -> Null)
  public static Optional<Book> findByBookName2(String name){
    if (name == null)
      throw new IllegalArgumentException("Wrong Book Nmae.");
    for (Book book : books){
      if (book.getBookName().contains(name)){
        return Optional.of(book);
      }
    }
    return Optional.empty();
  }

  public static Optional<Book> findbyPublishDate(){
    for (Book book : books){
      if (book.getPublishDate().getYear() >2020){
        return Optional.of(book);
      }
    }
    return Optional.empty();
  }
}
