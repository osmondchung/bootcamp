public class Librarian {
  private Bookshelf bookshelf;
  private Book[] books;

  public Librarian(){
    this.books = new Book[0];
  }
  
  // add books to librarian
  public void add(Book book){
    Book[] books = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++){
      books[i] = this.books[i];
    }
    books[books.length - 1] = book;
    this.books = books;
  }

  public Book[] getBook(){
    return this.books;
  }

}
