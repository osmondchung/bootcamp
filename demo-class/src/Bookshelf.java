public class Bookshelf {
  private Book[] books;
  private Librarian librarian;

  public Bookshelf(){
    this.books = new Book[0];
  }

  // add books to bookshelf
  public void add(Book book){
    // create new array
    Book[] books = new Book[this.books.length + 1];
    // copy the elements in this.books to new array books
    for (int i = 0; i < this.books.length; i++){
      books[i] = this.books[i];
    }
    // Add the new book to the tail of array
    books[books.length - 1] = book;
    // replace the new array to the object array address
    this.books = books;
  }

  // getter
  // get book from bookshelf
  public Book[] getBook(){
    return this.books;
  }

}
