// One to Many
public class Order {
  private Item[] items;
  
  //
  public void setItems(Item[] items){
    this.items = items;
  }

  public Item[] getItems(){
    return this.items;
  }

  public void add(Item item){
    Item[] items = new Item[this.items.length +1];
    for (int i = 0; i < items.length; i++){
      items[i] = items[i];
    }
  }
  // method presentation -> total price
  public double totalPrice(){
    double sum = 0; 
    for (int i = 0; i < items.length; i++){
      sum += this.getItems()[i].Subtotal();
    }
    return sum;
  }

  public static void main(String[] args) {
    Item item1 = new Item();
    item1.setPrice(10);
    item1.setQuantity(3);

    Item item2 = new Item();
    item2.setPrice(20);
    item2.setQuantity(2);
    
    Item[] items = new Item[2];
    items[0] = item1;
    items[1] = item2;

    Order order1 = new Order();
    order1.setItems(items);

    Item item3 = new Item();
    item3.setPrice(100);
    item3.setQuantity(1);
    //order1.add(item3);
    
    Order order2 = new Order();
    order2.setItems(items);

    System.out.println(order1.getItems()[0].Subtotal());
    System.out.println(order1.totalPrice());
    System.out.println(order2.getItems()[0].Subtotal());
    System.out.println(order2.totalPrice());
  }

}

