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

}
