/*public class Salad {
  private String vege;
  private String sauce;

  public Salad(String vege, String sauce){
    this.vege = vege;
    this.sauce = sauce;
  }

  public String getVege(){
    return this.vege;
  }

  public String getSauce(){
    return this.sauce;
  }

  public static Builder builder(){
    return new Builder();
  }

  public static class Builder {
    private String vege;
    private String sauce;

    public Builder Vege(String vege){
      this.vege = vege;
      return this;
    }

    public Builder Sauce(String sauce){
      this.sauce = sauce;
      return this;
    }

    public Salad build(){
      return new Salad(this.vege, this.sauce);
    }

    
  }
  public static void main(String[] args) {
    
  }
}*/


public class Burger {
  private String meat;
  private String cheese;

  public Burger(String meat, String cheese){
    this.meat = meat;
    this.cheese = cheese;
  }

  public String getMeat(){
    return this.meat;
  }

  public String getCheese(){
    return this.cheese;
  }

  public static Builder builder(){
    return new Builder();
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
      return new Burger(this.meat, this.cheese);
    }
  }

  public static void main(String[] args) {
    // if there are 10 attributes and 8 of them are null it is hard to assign null/ non-null value
    new Burger("ABC", "IJK");
    new Burger(null, "IJK");
    new Burger("ABC", null);

    // Builder pattern avoid assigning null value during initial creation
    Burger b1 = Burger.builder() // create Builder Object
      .Meat("ABC")
      .Cheese("DEF")
      .build(); // create Burger Object

    Burger b2 = Burger.builder() // create Builder Object
      .Meat("ABC")
      .build();

    Burger b3 = Burger.builder() // create Builder Object
      .Cheese("DEF")
      .build();
  }
}
