package enum1;

public class DemoEnum {
  public static void main(String[] args) {
    System.out.println(Color.RED);
    Book b1 = new Book(1, Color.RED);
    Book b2 = new Book(1, Color.BLUE);
    System.out.println(b1.getColor());
    System.out.println(b2.getColor());
    
    b1.setColor(Color.YELLOW);
    System.out.println(b1.getColor());

    // primitive and enum can use comparison operators
    // enum -> != or ==
    if (b1.getColor() == Color.YELLOW){ // checking adress (we have only one color.red in memory)
      System.out.println("yes");
    } else {
      System.out.println("Nah");
    }

    OrderStatus o1 = OrderStatus.PREPARING;
    System.out.println(o1.next());
    System.out.println(o1.next().next());

  }
}