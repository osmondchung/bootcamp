public class Item {
  private double price;
  private int quantity;

  // Constructor
  // by default, Java Class contains empty constructor (implicitly exists)

  // Constructor
  // 1. constructor has No return tyoe
  // 2. Class Name Exactly
  public Item() { // empty constructor: No input parameter
    
  }

  //
  public void setPrice(double price){
    this.price = price;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  // method presentation -> subtotal
  public double Subtotal(){
    return this.price * this.quantity;
  }

  public static void main(String[] args) {
    // "new" is calling constructor "Item()"

  }

}
