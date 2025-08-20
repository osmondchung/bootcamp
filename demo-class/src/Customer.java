// HKTVMall

import java.math.BigDecimal;

public class Customer {
  private Order[] orders;

  // Constructor
  public Customer() {
    this.orders = new Order[0];
  }

  public void add(Order order){
    Order[] orders = new Order[this.orders.length +1];
    for (int i = 0; i < this.orders.length; i++){
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = order;
    this.orders = orders;
  }

  public double totalPurchasedAmount(){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Order orders : this.orders){
      total = total.add(BigDecimal.valueOf(orders.totalPrice()));
    }
    return total.doubleValue();
  }

  public boolean isVip(){
    return this.totalPurchasedAmount() > 100000;
  }
  

  public static void main(String[] args) {
    
    Item item1 = new Item();
    item1.setPrice(10);
    item1.setQuantity(3);

    Item item2 = new Item();
    item2.setPrice(20);
    item2.setQuantity(2);

    Item item3 = new Item();
    item3.setPrice(100);
    item3.setQuantity(1);

    Order order1 = new Order();
    order1.add(item1);
    order1.add(item2);
    order1.add(item3);
    
    Item item4 = new Item();
    item4.setPrice(5000);
    item4.setQuantity(1);

    Order order2 = new Order();
    order2.add(item4);

    Customer cus1 = new Customer();
    cus1.add(order1);
    cus1.add(order2);

    System.out.println(cus1.totalPurchasedAmount());
    System.out.println(cus1.isVip());

  }
}
