// HKTVMall
public class Customer {
  private Order[] orders;

  //

  // method presentaiton -> totalPurchasedAmount()
  // -> isVip(), totalPurchasedAmount > 1000000

  public double totalPurchasedAmount(){

    return ;
  }

  public boolean isVip(){
    return this.totalPurchasedAmount() > 1000000;
  }
  

  public static void main(String[] args) {
    Customer cus1 = new Customer();
    

    System.out.println(cus1.totalPurchasedAmount());
    System.out.println(cus1.isVip());

    Customer cus2 = new Customer();
    System.out.println(cus2.totalPurchasedAmount());
    System.out.println(cus2.isVip());
  }
}
