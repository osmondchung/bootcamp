package enum1;

// Finite number of values
// Not change often
public enum OrderStatus {
  PAID(1), PREPARING(2), DELIVERING(3), DELIVERED(4);

  private int value;

  // enum constructor -> private
  private OrderStatus(int value){
    this.value = value;
  }
  // JVM -> create enum object for you
  // and you cannot create enum object by constructor

  public int getValue(){
    return this.value;
  }

  public OrderStatus next(){
    return valueOf(this.value + 1);
  }

  // OrderStatus.values() -> return all enum values
  public static OrderStatus valueOf(int value){
    for (OrderStatus o : OrderStatus.values()){
      if (o.getValue() == value)
      return o;
    }
    return null;
  }

}

