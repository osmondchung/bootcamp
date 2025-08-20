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

  public void add(Book book){
    // create new array
    Book[] books = new Book[this.book.length +1];
    // copy the elements in this.items to new array items
    for (int i = 0; i < this.book.length; i++){
      books[i] = this.book[i];
    }
    // Add the new item to the tail of array
    books[books.length - 1] = book;
    // replace the new array to the object array address
    this.book = books;
  }

  private void remove(int idex){

  }

  public static void main(String[] args) {
    Library lib = new Library();
    Book b1 = new Book();

    
  }


}
