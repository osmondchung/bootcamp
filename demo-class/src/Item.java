public class Item {
  private double price;
  private int quantity;

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

}
