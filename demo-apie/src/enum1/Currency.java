package enum1;

public enum Currency {
  HKD("Hong Kong Dollar", 1), 
  USD("USA", 2), 
  CNY("Chinese", 3), 
  AUD("Australian", 4),;

  private String description;
  private int value;

  private Currency(String description, int value){
    this.description = description;
    this.value = value;
  }

  public String getCurrency(){
    return this.description;
  }

  public int getValue(){
    return this.value;
  }

  public Currency idk(){

  }
  


  public static void main(String[] args) {
    
  }
}
