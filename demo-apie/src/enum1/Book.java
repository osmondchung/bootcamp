package enum1;

public class Book {
  private int id;
  private Color color;

  public Book(int id, Color color){
    this.id = id;
    this.color = color;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public void setId(int id){
    this.id = id;
  }

  public Color getColor(){
    return this.color;
  }

  public int getId(){
    return this.id;
  }

  public static void main(String[] args) {
    
  }
}
