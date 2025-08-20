// One to Many

import java.math.BigDecimal;

public class Order {
  private Item[] items;
  
  public Order() {
    // initial load of creating object
    this.items = new Item[0];
  }

  // method to add item to order
  public void add(Item item){
    // create new array
    Item[] items = new Item[this.items.length +1];
    // copy the elements in this.items to new array items
    for (int i = 0; i < this.items.length; i++){
      items[i] = this.items[i];
    }
    // Add the new item to the tail of array
    items[items.length - 1] = item;
    // replace the new array to the object array address
    this.items = items;
  }

  // method presentation -> total price
  public double totalPrice(){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Item item : this.items){
      total = total.add(BigDecimal.valueOf(item.Subtotal()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {

  }

}

