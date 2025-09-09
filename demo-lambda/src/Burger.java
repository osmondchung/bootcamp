public class Burger {
  private String meat;
  private String cheese;

  public static Builder builder(){
    return new Builder();
  }

  private Burger(Builder builder){
    this.meat = builder.meat;
    this.cheese = builder.cheese;
  }

  public String getMeat(){
    return this.meat;
  }

  public String getCheese(){
    return this.cheese;
  }

  public static class Builder {
    private String meat;
    private String cheese;

    public Builder Meat(String meat){
      this.meat = meat;
      return this;
    }

    public Builder Cheese(String cheese){
      this.cheese = cheese;
      return this;
    }

    public Burger build(){
      return new Burger(this);
    }
  }

  public static void main(String[] args) {
    // if there are 10 attributes and 8 of them are null it is hard to assign null/ non-null value

    // Builder pattern avoid assigning null value during initial creation
    Burger b1 = Burger.builder() // create Builder Object
      .Meat("ABC")
      .Cheese(("DEF"))
      .build(); // create Burger Object

    Burger b2 = Burger.builder() // create Builder Object
      .Meat("ABC")
      .build();

    Burger b3 = Burger.builder() // create Builder Object
      .Cheese(("DEF"))
      .build();
  }
}
