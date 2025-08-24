public class Library {
  private Librarian librarian;
  private Bookshelf bookshelf;
  
  // Librarian (per library)
  // Bookshelf (per library)

  // constructor -> the process of creating object
  public Library(Librarian librarian, Bookshelf bookshelf) {
    this.librarian = librarian;
    this.bookshelf = bookshelf;
  }

  private void remove(int idex){

  }

  public static void main(String[] args) {
    Librarian libra1 = new Librarian();
    Bookshelf bs1 = new Bookshelf();
    Library lib1 = new Library(libra1, bs1);
    Book b1 = new Book("Power", "Louis", 2000);
    Book b2 = new Book("Leader", "oscar", 1980);
    bs1.add(b1);
    bs1.add(b2);
    bs1.getBook();
    System.out.println(bs1.getBook());

  }


}
